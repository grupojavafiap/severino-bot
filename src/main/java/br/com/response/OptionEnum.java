package br.com.response;

public enum OptionEnum
{
    START("/start"), 
    HELP_OPTION("/help"), 
    SETTINGS_OPTION("/settings"),
    MENU("99"),
    GREETING("^oi|^ola|^olá|^hello"),
    BYE("^tchau.*|^tcha.*|^adeus.*|.*ate logo.*|.*ate mais.*"),
    DAY("boa-(tarde|noite)|^bom-(dia)*"),
    CURRENT_DAY("1"),
    CURRENT_HOUR("2"),
    ADDRESS("3|\\d\\d\\d\\d\\d\\d\\d\\d|\\d\\d\\d\\d\\d-\\d\\d\\d"),
    WEATHER("4");


    private String value;

    private OptionEnum(String value)
    {   
        this.value = value;
    }   

    public String getValue()
    {
        return value;
    }
}