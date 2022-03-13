package br.com.rest.consume.checkApp;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/ping")
@RegisterRestClient(configKey = "severino")
public interface CheckAppService {

    /**
     * Consulta informações do clima da cidade informada. 
     */
    @GET
    String ping();
}
