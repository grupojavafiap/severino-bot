package br.com.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;


@ApplicationScoped()
public class BotService {

    private static final Logger LOGGER = Logger.getLogger("BotService");

    TelegramBot bot;

    void onStart(@Observes StartupEvent ev) 
    {
        var name = System.getProperty("BOT_NAME");
        
        if(name == null)
        {
            name = System.getenv("BOT_NAME");
        }
        var botName = name;
        LOGGER.info("Iniciando o BOT - Severino será criado - " + botName);
        init();
    }

    void onStop(@Observes ShutdownEvent ev) {               
        LOGGER.info("The application is stopping...");
    }
    

    private void init()
    {
        var token = getBotToken();
        bot = createBot(token);
    }

    /**
     * Cria o Bot e seta o listener para escutar as alterações
     * 
     * @param token
     * @return
     */
    private TelegramBot createBot(String token)
    {
        TelegramBot newBot = new TelegramBot(token);

        newBot.setUpdatesListener(updates -> {

            receiveMessage(updates);
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });

        return newBot;
    }


    private void receiveMessage(List<Update> updates)
    {
        for(Update update: updates)
        {
            System.out.println("text " + update.message().text());
            
            var name = update.message().from().firstName();

            long chatId = update.message().chat().id();
            bot.execute(new SendMessage(chatId, "Hello! " + name));
        }
    }


    String getBotToken()
    {
        var token = System.getProperty("BOT_TOKEN");

        if(token == null)
        {
            token = System.getenv("BOT_TOKEN");
        }

        return token;
    }


    
    
}