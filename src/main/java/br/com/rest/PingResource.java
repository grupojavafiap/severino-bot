package br.com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

@Path("ping")
public class PingResource {

    private static final Logger LOGGER = Logger.getLogger("PingResource");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response health() 
    {
        LOGGER.info("--->>> PONG");
        return Response.ok("PONG").build();
    }
}