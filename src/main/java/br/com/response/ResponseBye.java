package br.com.response;

public class ResponseBye implements ResponseChat
{

    @Override
    public String run(String message, String username, long chatId) 
    {
        return "Até mais "+ username + "!";
    }
    
}
