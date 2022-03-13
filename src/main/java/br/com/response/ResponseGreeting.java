package br.com.response;

public class ResponseGreeting implements ResponseChat
{

    @Override
    public String run(String message, String username, long chatId) 
    {
        return "Olá "+ username + ", tudo bem?";
    }
    
}
