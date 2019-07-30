package Observer.myinterface.impl;

import Observer.myinterface.Display;
import Observer.myinterface.Observer;
import Observer.myinterface.Subject;

public class ForecastDisplay implements Observer, Display {
    private  float pres;
    Subject  weahterData;
    public ForecastDisplay(Subject weahterData){
        this.weahterData = weahterData;
        weahterData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humy, float pres) {
        this.pres = pres;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: " + pres);
    }
}
