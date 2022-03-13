package br.com;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.eventbus.EventBus;
import org.jboss.logging.Logger;

import br.com.dialog.MessagePublish;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;

@ApplicationScoped
public class StartBoot {

    @Inject
    EventBus eventBus; 
    
    private static final Logger LOGGER = Logger.getLogger("StartBoot");

    TelegramBot bot;

    void onStart(@Observes StartupEvent ev) 
    {
        var name = System.getProperty("BOT_NAME");

        if (name == null) {
            name = System.getenv("BOT_NAME");
        }
        var botName = name;
        LOGGER.info("Iniciando o BOT - Severino será criado - " + botName);
        init();
    }

    void onStop(@Observes ShutdownEvent ev) 
    {
        LOGGER.info("Severino esta sendo encerrado...");
    }

    private void init() 
    {
        var token = getBotToken();
        bot = createBot(token);
    }

    /**
     * Retorna uma instancia do boot
     * 
     * @param token
     * @return
     */
    private TelegramBot createBot(String token) 
    {
        if(bot == null)
        {
            bot = new TelegramBot(token);
            bot.setUpdatesListener(updates -> {

                receiveMessage(updates);
    
                return UpdatesListener.CONFIRMED_UPDATES_ALL;
            });
        }

        return bot;
    }

    /**
     * 
     * 
     * @param updates
     */
    private void receiveMessage(List<Update> updates) 
    {
        for (Update update : updates) 
        {
            LOGGER.info("[receiveMessage] text -> " + update.message().text());

            eventBus.publish("br.com.dialog.Dialog", new MessagePublish(update, bot));
        }
        
    }

    String getBotToken() {
        var token = System.getProperty("BOT_TOKEN");

        if (token == null) {
            token = System.getenv("BOT_TOKEN");
        }

        return token;
    }

}