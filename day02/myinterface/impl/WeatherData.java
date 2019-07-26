package day02.myinterface.impl;

import day02.myinterface.Observer;
import day02.myinterface.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> observers;
    private  float temp;
    private  float humy;
    private  float pres;

    public  WeatherData(){
        observers= new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
       if(o instanceof Observer){
           observers.add(o);
           System.out.println(o+":be registered");
       }else{
           System.out.println("login has failed");
       }
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.remove(o)){
            System.out.println(o+"be remove");
        }else{
            System.out.println(o+"remove fail");
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers) {
            observer.update(temp,humy,pres);
        }
    }
    public void change(){
        notifyObserver();
    }
    public void setChange(float temp,float humy,float pres){
        this.temp = temp;
        this.humy = humy;
        this.pres = pres;
        change();
    }
}
