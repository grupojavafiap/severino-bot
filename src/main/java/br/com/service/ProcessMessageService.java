package br.com.service;

import javax.enterprise.context.ApplicationScoped;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;

@ApplicationScoped
public class ProcessMessageService {

    private static final String START_OPTION = "/start";
    private static final String HELP_OPTION = "/help";
    private static final String MENU_OPTION = "99";
    private static final String SETTINGS_OPTION = "/settings";

    private static final String GREENTING_MESSAGE = "Eaê, blz? Sou o Severino, as suas ordens. Para eu mostrar as opções só digitar 99";
    private static final String MESSAGE_NOT_UNDERSTAND = "Poxa, não entendi...Estou aprendendo!!";
    private static final String MENU = "\n01 - opcao 1 \n02 - opcao 2 \n03                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  - opcao 3";

    public String process(Update update) {
        if (update.message().text().contains(START_OPTION)) {
            return GREENTING_MESSAGE;
        } else if (update.message().text().contains(MENU_OPTION)) {
            return MENU;
        }

        return MESSAGE_NOT_UNDERSTAND;

    }

}
