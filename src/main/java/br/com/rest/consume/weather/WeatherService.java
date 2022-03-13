package br.com.rest.consume.weather;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import br.com.rest.consume.weather.dto.WeatherDto;


@Path("/api/v1/weather")
@RegisterRestClient(configKey = "weather")
public interface WeatherService {

    /**
     * Consulta informações do clima da cidade informada. 
     */
    @GET
    @Path("/locale/{locale}/current")
    WeatherDto getWeather(@PathParam String locale, @QueryParam String token);
}
