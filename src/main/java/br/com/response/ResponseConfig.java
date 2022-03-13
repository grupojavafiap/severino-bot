package br.com.response;

public class ResponseConfig implements ResponseChat
{

    @Override
    public String run(String message, String username, long chatId) 
    {
        if(message != null)
        {
            if(OptionEnum.START.getValue().equals(message))
            {
                return ResponseMessage.OPTIONS_MENU;
            }
                
            if(OptionEnum.HELP_OPTION.getValue().equals(message))
            {
                return ResponseMessage.HELP;
            }
            if(OptionEnum.SETTINGS_OPTION.getValue().equals(message))
            {
                return ResponseMessage.SETTINGS;
            }
                
            if(OptionEnum.MENU.getValue().equals(message))
            {
                return ResponseMessage.OPTIONS_MENU;
            }
        }
        return ResponseMessage.OPTIONS_MENU;    
    }
    
}
