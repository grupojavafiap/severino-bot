package br.com.rest.consume.participants;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkus.vertx.http.runtime.devmode.Json;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/participants")
@RegisterRestClient(configKey = "participants")
public interface ParticipantsService {

    /**
     * Consulta a lista de participantes no diretório do open banking.
     * 
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Json> getParticipants();
}
