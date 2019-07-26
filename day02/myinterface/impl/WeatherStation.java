package day02.myinterface.impl;

import day02.myinterface.Observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData data = new WeatherData();
        CurrentConditionsDisplay observer = new CurrentConditionsDisplay(data);
        ForecastDisplay forecast = new ForecastDisplay(data);
        data.setChange(36,10,1200);
    }
}
