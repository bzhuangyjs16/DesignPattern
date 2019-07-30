package Observer.myinterface.impl;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay observer = new CurrentConditionsDisplay(data);
        ForecastDisplay forecast = new ForecastDisplay(data);
        data.setChange(36,10,1200);
    }
}
