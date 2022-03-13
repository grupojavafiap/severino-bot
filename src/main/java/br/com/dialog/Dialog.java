package br.com.dialog;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import br.com.data.MemoryDb;
import io.quarkus.vertx.ConsumeEvent;

@RequestScoped
public class Dialog {


    @Inject
    public MemoryDb db;

    @ConsumeEvent
    public void process(MessagePublish message) 
    {    
        var update = message.getUpdate();
        var bot = message.getBot();
        var username = update.message().chat().firstName();
        long chatId = update.message().chat().id();
        
        bot.execute(new SendChatAction(chatId, ChatAction.typing.name()));
        
        var response = db.getResponse(update.message().text(), username, chatId);

        if(response != null)
        {
            bot.execute(new SendMessage(chatId, response));
        }

    }

}
