package day02.myinterface.impl;

import day02.myinterface.Display;
import day02.myinterface.Observer;
import day02.myinterface.Subject;
import jdk.internal.loader.AbstractClassLoaderValue;

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
