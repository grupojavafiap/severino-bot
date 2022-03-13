package br.com.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ResponseCurrentHour implements ResponseChat
{

    @Override
    public String run(String message, String username, long chatId) 
    {
        DateTimeFormatter horaPadrao = DateTimeFormatter.ofPattern("HH:mm");
        String horaAgora = LocalDateTime.now().format(horaPadrao);
        String msg = username + ", agora são " + horaAgora;

        return msg;
    }
    
}
