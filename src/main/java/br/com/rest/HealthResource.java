package br.com.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.rest.consume.participants.ParticipantsService;
import io.quarkus.vertx.http.runtime.devmode.Json;

@Path("/health")
public class HealthResource {

    @Inject
    @RestClient
    private ParticipantsService participantsService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response health() {
        List<Json> participantes = participantsService
                .getParticipants();

        // return Response.ok("{'status': 'UP'}").build();

        return Response.ok().entity(participantes).build();
    }
}