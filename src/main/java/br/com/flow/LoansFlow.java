package br.com.flow;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import br.com.rest.consume.participants.ParticipantsService;

@RequestScoped
public class LoansFlow {

    @Inject
    @RestClient
    ParticipantsService participantsService;

    public void init(Update update, TelegramBot bot) 
    {
        long chatId = update.message().chat().id();

        System.out.println("Iniciando o fluxo de emprestimo....");
       
        var participants = participantsService.getParticipants();

        System.out.println(" Participantes .... ");
        System.out.println(participants.get(0).getCity());  
        System.out.println(participants.get(0).getOrganisationId());    

        bot.execute(new SendMessage(chatId, "Participantes..."));
    }
}
