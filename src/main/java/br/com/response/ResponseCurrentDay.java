package br.com.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ResponseCurrentDay implements ResponseChat
{

    @Override
    public String run(String message, String username, long chatId) 
    {
        DateTimeFormatter dataPadrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataHoje = LocalDateTime.now().format(dataPadrao);
        return username + ", hoje é dia " + dataHoje;
    }
    
}
