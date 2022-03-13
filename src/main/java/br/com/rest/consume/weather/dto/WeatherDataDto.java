package br.com.rest.consume.weather.dto;

public class WeatherDataDto {
    
    private int  temperature;
    private String wind_direction;
    private int wind_velocity;
    private int humidity;
    private String condition;
    private int  pressure;
    private String icon;
    private int sensation;
    private String date;

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String getWind_direction() {
        return wind_direction;
    }
    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }
    public int getWind_velocity() {
        return wind_velocity;
    }
    public void setWind_velocity(int wind_velocity) {
        this.wind_velocity = wind_velocity;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public int getPressure() {
        return pressure;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public int getSensation() {
        return sensation;
    }
    public void setSensation(int sensation) {
        this.sensation = sensation;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "WeatherDataDto [condition=" + condition + ", date=" + date + ", humidity=" + humidity + ", icon=" + icon
                + ", pressure=" + pressure + ", sensation=" + sensation + ", temperature=" + temperature
                + ", wind_direction=" + wind_direction + ", wind_velocity=" + wind_velocity + "]";
    }



    
}
