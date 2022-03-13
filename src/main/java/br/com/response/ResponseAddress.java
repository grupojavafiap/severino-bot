package br.com.response;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import br.com.data.MemoryDb;
import br.com.rest.consume.address.AddressService;
import br.com.rest.consume.address.dto.AddressDto;

@RequestScoped
public class ResponseAddress implements ResponseChat
{
    private static final Logger LOGGER = Logger.getLogger("ResponseAddress");
    private static final String OPTION_ADDRESS = "3";
    
    @Inject
    @RestClient
    public AddressService addressService;

    @Inject
    public MemoryDb db;

    @Override
    public String run(String message, String username, long chatId) 
    {
        StringBuilder response = new StringBuilder();

        if(message != null)
        {
            if(OPTION_ADDRESS.equals(message))
            {
                var address = db.lastCep(chatId);

                System.out.println("\n\n address "+ address);

                if(address != null && !address.isEmpty())
                {
                    response.append(username + ", o ultimo CEP que vc consultou foi: \n" + address +"\n\n"); 
                }

                response.append("Por favor, informe o CEP: ");
            }
            else
            {   
                String cep = message.replaceAll("\\-", "");
                LOGGER.debug("-->> CEP Recebido "+ cep);
                return findAddress(cep, chatId);
            }
        }

        return response.toString();
    }


    private String findAddress(String cep, long chatId)
    {
        StringBuilder response = new StringBuilder();
        try 
        {
            var addressCached = db.getAddressCached(cep);

            if(addressCached != null && !addressCached.isEmpty())
            {
                db.setAddress(chatId, addressCached, cep);
                return addressCached;
            }

            AddressDto address = addressService.getAddressByCep(cep);

            if (address.getLogradouro() == null) 
            {
                response.append("): Ops!! Não encontramos endereço para o CEP "+ cep);
            } 
            else 
            {
                response.append("O endereço do CEP " + address.getCep() + " é: ");
                response.append(address.getLogradouro() + " ");
                response.append(address.getBairro() + " ");
                response.append(address.getComplemento() + " ");
                response.append(address.getLocalidade() + "/" + address.getUf());
            }

        } 
        catch (Exception e) 
        {
            LOGGER.error(e);
            response.append("): Ops!! Ocorreu um erro ao consultar o CEP "+ e.getMessage());
        }

        String addressResponse = response.toString();
        
        //Armazena em cache o CEP pesquisado.
        db.setCacheCep(cep, addressResponse);

        //Armazena no histórico do chat.
        db.setAddress(chatId, addressResponse, cep);

        return addressResponse;
    }
    
}
