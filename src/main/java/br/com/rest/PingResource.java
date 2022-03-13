package br.com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("ping")
public class PingResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response health() 
    {
        return Response.ok("PONG").build();
    }
}