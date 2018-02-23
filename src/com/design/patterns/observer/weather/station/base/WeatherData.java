package com.design.patterns.observer.weather.station.base;

import com.design.patterns.observer.weather.station.observers.MyObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by himu on 2/23/2018.
 */
public class WeatherData implements Subject{

    private float temp;
    private float humidity;
    private float pressure;

    List<MyObserver> observers = new ArrayList<>();

    public void addObserver(MyObserver observer){
        observers.add(observer);
    }
    public void removeObserver(MyObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){

        observers.forEach( observer -> observer.update(this));
    }
    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }
    public void measurementsChanged(){
    notifyObservers();
    }
}
