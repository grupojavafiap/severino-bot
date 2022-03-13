package br.com.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ResponseDay implements ResponseChat
{
    @Override
    public String run(String message, String username, long chatId) 
    {
        StringBuilder msg = new StringBuilder();

        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH");
        Integer hora = Integer.valueOf(LocalDateTime.now().format(horaFormatter));

        if (hora > 3 && hora < 12) 
        {
            msg.append("Bom dia, ");
        } 
        else if (hora < 18) 
        {
            msg.append("Boa tarde, ");
        } else 
        {
            msg.append("Boa noite, ");
        }
        
        msg.append(username);
        msg.append("! Como posso ajudar?. Digite 99 para visualizar as opções!");

        return msg.toString();

    }
    
}
