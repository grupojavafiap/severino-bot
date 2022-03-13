package br.com.response;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import br.com.rest.consume.weather.WeatherService;
import br.com.rest.consume.weather.dto.WeatherDto;

@RequestScoped
public class ResponseWeather implements ResponseChat
{
    private static final Logger LOGGER = Logger.getLogger("ResponseWeather");

    private String locale = null;
    private String token = null;

    public ResponseWeather()
    {
        token = getToken();
        locale = getLocale();
    }

    @Inject
    @RestClient
    public WeatherService weatherService;


    @Override
    public String run(String message, String username, long chatId) 
    {
        return findWeather();
    }


    private String findWeather()
    {
        StringBuilder response = new StringBuilder();
        try 
        {
            WeatherDto weather = weatherService.getWeather(locale, token);

            if(weather != null)
            {
                response.append("Cidade: "+ weather.getName() + "/" + weather.getState() +"\n");
                response.append("Temperatura: "+ weather.getData().getTemperature() + "\n");
                response.append("Humidade: "+ weather.getData().getHumidity() + "\n");
                response.append("Condição: "+ weather.getData().getCondition() + "\n");
                response.append("Sensação: "+ weather.getData().getSensation() + "\n");
                response.append("Data: "+ weather.getData().getDate() + "\n");
            }
            
        } 
        catch (Exception e) 
        {
            LOGGER.error(e);
            response.append("): Ops!! Ocorreu um erro ao consultar o Clima Tempo "+ e.getMessage());
        }

        return response.toString();
    }

    private String getToken() {
        var token = System.getProperty("TOKEN_WEATHER");

        if (token == null) {
            token = System.getenv("TOKEN_WEATHER");
        }

        return token;
    }
    

    private String getLocale() {
        var locale = System.getProperty("LOCALE_ID_WEATHER");

        if (locale == null) {
            locale = System.getenv("LOCALE_ID_WEATHER");
        }

        return locale;
    }
}
