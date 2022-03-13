package br.com.rest.consume.address;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import br.com.rest.consume.address.dto.AddressDto;


@Path("/ws")
@RegisterRestClient(configKey = "correios")
public interface AddressService {

    /**
     * Consulta o endereço através do CPF.
     * 
     */
    @GET
    @Path("/{cep}/json")
    AddressDto getAddressByCep(@PathParam String cep);
}
