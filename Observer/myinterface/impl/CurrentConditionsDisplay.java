package day02.myinterface.impl;

import day02.myinterface.Display;
import day02.myinterface.Observer;
import day02.myinterface.Subject;
import jdk.internal.loader.AbstractClassLoaderValue;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temp;
    private float humy;
    Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humy, float pres) {
        this.temp = temp;
        this.humy = humy;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp
                + "F degrees and " + humy + "% humidity");
    }
}
