package br.com.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import com.pengrad.telegrambot.request.SendMessage;
import br.com.flow.LoansFlow;
import io.quarkus.vertx.ConsumeEvent;

@RequestScoped
public class ProcessMessageService {


    @Inject
    private LoansFlow loansFlow;

    private static final String START_OPTION = "/start";
    private static final String HELP_OPTION = "/help";
    private static final String MENU_OPTION = "99";
    private static final String MENU_OPTION_LOAN = "1";
    private static final String SETTINGS_OPTION = "/settings";

    private static final String GREENTING_MESSAGE = "Eaê, blz? Sou o Severino, as suas ordens. Para eu mostrar as opções só digitar 99";
    private static final String MESSAGE_NOT_UNDERSTAND = "Poxa, não entendi...Estou aprendendo!!";
    private static final String MENU = "\n1 - Emprestimos \n2 - opcao 2 \n3 - opcao 3";


    @ConsumeEvent
    public void process(MessagePublish message) 
    {    
        var update = message.getUpdate();
        var bot = message.getBot();
        long chatId = update.message().chat().id();

        if (update.message().text().contains(START_OPTION)) 
        {
            bot.execute(new SendMessage(chatId, GREENTING_MESSAGE));
        } 
        else if (update.message().text().contains(MENU_OPTION)) 
        {
            bot.execute(new SendMessage(chatId, MENU));
        }
        else if (update.message().text().contains(MENU_OPTION_LOAN)) 
        {
            this.loansFlow.init(update, bot);
        }
        else
        {
            bot.execute(new SendMessage(chatId, MESSAGE_NOT_UNDERSTAND));
        }
        
    }

}
