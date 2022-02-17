package br.com.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import br.com.rest.consume.participants.ParticipantsService;

@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    ParticipantsService participantsService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        var participants = participantsService.getParticipants();
        return Response.ok(participants).build();
    }
}