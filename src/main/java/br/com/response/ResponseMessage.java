package br.com.response;

public class ResponseMessage {
    
    public final static  String OPTIONS_MENU = "Digite uma das opções abaixo:" + System.lineSeparator()
    + "1-Para saber a data de hoje;" + System.lineSeparator()
    + "2-Para saber a hora agora;" + System.lineSeparator()
    + "3-Descobrir um endereço pelo CEP;" + System.lineSeparator()
    + "4-Informações sobre o tempo." + System.lineSeparator()
    + "Ou diga 'tchau' para encerrar o papo";


    public final static String SETTINGS = "Configurações do " + getBotName() + ". Digite 99 para voltar ao menu.";

    public final static String HELP = "O que eu posso te ajudar?. Digite 99 para voltar ao menu.";

    public final static String NO_UNDERSTAND = "Desculpa, mas não entendi... Digitando 99 te mostro as opções!!";


    /**
     * Retorna o nome do BOT.
     * 
     * @return
     */
    private static String getBotName()
    {
        var name = System.getProperty("BOT_NAME");

        if (name == null) {
            name = System.getenv("BOT_NAME");
        }

        return name;
    }

}
