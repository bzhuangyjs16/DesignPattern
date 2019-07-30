package Observer.myinterface.impl;

import Observer.myinterface.Display;
import Observer.myinterface.Observer;
import Observer.myinterface.Subject;

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
