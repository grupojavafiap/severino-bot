package br.com.data;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.response.ResponseChat;
import br.com.response.ResponseConfig;
import br.com.response.ResponseCurrentDay;
import br.com.response.ResponseCurrentHour;
import br.com.response.ResponseDay;
import br.com.response.ResponseGreeting;
import br.com.util.RegexHashMap;
import br.com.response.ResponseMessage;
import br.com.response.ResponseWeather;
import br.com.response.OptionEnum;
import br.com.response.ResponseAddress;
import br.com.response.ResponseBye;

@ApplicationScoped
public class MemoryDb {

    public Map<String, ResponseChat> options = new RegexHashMap<>();
    public Map<Long, Storage> storageChat = new HashMap<>();
    public Map<String, String> cacheAddress = new HashMap<>();
    public ResponseAddress responseAddress;
    public ResponseWeather responseWeather;
    private static final Logger LOGGER = Logger.getLogger("MemoryDb");


    @Inject
    public MemoryDb(ResponseAddress responseAddress, ResponseWeather responseWeather)
    {   
        this.responseAddress = responseAddress;
        this.responseWeather = responseWeather; 
        initOptions();
    }


    private void initOptions()
    {
        var config = new ResponseConfig();

        options.put(OptionEnum.START.getValue(), config);
        options.put(OptionEnum.HELP_OPTION.getValue(), config);
        options.put(OptionEnum.SETTINGS_OPTION.getValue(), config);
        options.put(OptionEnum.MENU.getValue(), config);
        options.put(OptionEnum.GREETING.getValue(), new ResponseGreeting());
        options.put(OptionEnum.BYE.getValue(), new ResponseBye());
        options.put(OptionEnum.DAY.getValue(), new ResponseDay());
        options.put(OptionEnum.CURRENT_DAY.getValue(), new ResponseCurrentDay());
        options.put(OptionEnum.ADDRESS.getValue(), responseAddress);
        options.put(OptionEnum.CURRENT_HOUR.getValue(), new ResponseCurrentHour());
        options.put(OptionEnum.WEATHER.getValue(), responseWeather);
    }

    /**
     * Retorna a mensagem que representa a opção passada.
     * 
     * @param option
     * @return
     */
    public String getResponse(String text, String username, long chatId)
    {
        if(text != null)
        {
            var responseClass = options.get(text);

            if(responseClass != null)
            {
                return responseClass.run(text, username, chatId);
            }
        }
       
        return ResponseMessage.NO_UNDERSTAND;
    }


    public void setStorage(long chatId, Storage storage)
    {
        this.storageChat.put(chatId, storage);
    }

    public Storage getStorage(long chatId)
    {
        return this.storageChat.get(chatId);
    }

    public void setAddress(long chatId, String address, String cep)
    {
        if(chatId > 0 && address != null && cep != null)
        {
            var storage = this.getStorage(chatId);

            if(storage == null)
            {
                setStorage(chatId, new Storage());
                storage = this.getStorage(chatId);
            }

            storage.getCeps().add(new AddressStorage(address, cep));
        }
    }

    /**
     * Retorna o ultimo CEP consultado.
     * 
     * @param chatId
     * @return
     */
    public String lastCep(long chatId)
    {
        String cep = "";

        if(chatId > 0)
        {
            var storage = this.getStorage(chatId);

            if(storage != null)
            {
                var ceps = storage.getCeps();
                if(ceps != null && !ceps.isEmpty())
                {
                    cep = ceps.get(ceps.size() - 1).getAddress();
                }
            }
        }
        
        return cep;
    }


    public void setCacheCep(String cep, String address)
    {
        if(cep != null && address != null)
        {
            LOGGER.info("Armazenado o CEP "+ cep + " em CACHE!!!");
            this.cacheAddress.put(cep, address);
        }
    }

    /**
     * Consulta o endereço no cache pelo CEP passado
     * 
     * @param cep
     * @return
     */
    public String getAddressCached(String cep)
    {
        if(cep != null)
        {
            return this.cacheAddress.get(cep);
        }
        return null;
    }
}
