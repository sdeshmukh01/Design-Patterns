package com.design.patterns.observer.weather.station;

import com.design.patterns.observer.weather.station.base.WeatherData;
import com.design.patterns.observer.weather.station.observers.CurrentConditionsDisplay;
import com.design.patterns.observer.weather.station.observers.Display;

/**
 * Created by himu on 2/23/2018.
 */
public class WeatherStation {


    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        Display display = new CurrentConditionsDisplay(data);

        data.setHumidity(44.6f);
        data.setPressure(567);
        data.setTemp(122);
    }
}
