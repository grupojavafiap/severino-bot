package br.com.response;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.rest.consume.address.AddressService;

@RequestScoped
public class ResponseEngine {

    @Inject
    @RestClient
    AddressService participantsService;

    public void init(Update update, TelegramBot bot) 
    {
        long chatId = update.message().chat().id();

        System.out.println("Iniciando o fluxo de emprestimo....");

        bot.execute(new SendMessage(chatId, "Participantes..."));
    }
}
