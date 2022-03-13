package br.com.scheduler;

import java.util.concurrent.atomic.AtomicInteger;
import javax.enterprise.context.ApplicationScoped;
import io.quarkus.scheduler.Scheduled;
import io.quarkus.scheduler.ScheduledExecution;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import br.com.rest.consume.checkApp.CheckAppService;

@ApplicationScoped       
public class CheckApp {
    
    private static final Logger LOGGER = Logger.getLogger("CheckApp");

    @Inject
    @RestClient
    public CheckAppService checkAppService;

    @Scheduled(every="60s")     
    void ping() 
    {
        LOGGER.info("Realizando um ping na aplicação...");
        checkAppService.ping();
    }


}
