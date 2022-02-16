package br.com.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.ApplicationPath;

import com.pengrad.telegrambot.model.Message;

@ApplicationScoped
public class ProcessMessageService {

    private static final String  START_OPTION = "/start";
    private static final String  HELP_OPTION= "/help";
    private static final String  MENU_OPTION = "99";
    private static final String  SETTINGS_OPTION = "/settings";

    private static final String  GREENTING_MESSAGE = "Eaê, blz? Sou o Severino, as suas ordens. Para eu mostrar as opções só digitar 99";
    private static final String  MESSAGE_NOT_UNDERSTAND = "Poxa, não entendi...Estou aprendendo!!";
    private static final String  MENU = "\n**01** - opcao 1 \n**02** - opcao 2 \n**03** - opcao 3";


    public String process(Message message)
    {   
        if(message.text().contains(START_OPTION))
        {
            return GREENTING_MESSAGE;
        }
        else if(message.text().contains(MENU_OPTION))
        {
            return MENU;
        }

        return MESSAGE_NOT_UNDERSTAND;

    }


}
