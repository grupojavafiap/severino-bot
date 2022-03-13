
package br.com.rest.consume.weather.dto;

public class WeatherDto {
    
    private int id;
    private String name;
    private String state;
    private String country;
    private WeatherDataDto data;

    public int getId() {
        return id;
    }
    public WeatherDataDto getData() {
        return data;
    }
    public void setData(WeatherDataDto data) {
        this.data = data;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "WeatherDto [country=" + country + ", data=" + data + ", id=" + id + ", name=" + name + ", state="
                + state + "]";
    }

    

}
