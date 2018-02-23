package com.design.patterns.observer.weather.station.observers;

import com.design.patterns.observer.weather.station.base.Subject;
import com.design.patterns.observer.weather.station.base.WeatherData;

/**
 * Created by himu on 2/23/2018.
 */
public class CurrentConditionsDisplay implements Display {

    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData data;

    public CurrentConditionsDisplay(WeatherData data) {
        this.data = data;
        data.addObserver(this);
    }

    @Override
    public void update(Subject s) {
    if(s instanceof WeatherData) {
        this.humidity = ((WeatherData) s).getHumidity();
        this.pressure = ((WeatherData) s).getPressure();
        this.temp = ((WeatherData) s).getTemp();
        display();
    }

    }

    @Override
    public void display() {
        System.out.println("Current Conditions: temperature- "+temp +", pressure- "+pressure+", humidity- "+humidity);

    }
}
