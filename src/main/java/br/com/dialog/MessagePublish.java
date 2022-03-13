package br.com.dialog;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;

public class MessagePublish {
    
    private Update update;
    private TelegramBot bot;



    public MessagePublish(){}

    public MessagePublish(Update update, TelegramBot bot)
    {
        this.update = update;
        this.bot = bot;
    }


    public Update getUpdate() {
        return update;
    }

    public TelegramBot getBot() {
        return bot;
    }

    public void setBot(TelegramBot bot) {
        this.bot = bot;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    


}
