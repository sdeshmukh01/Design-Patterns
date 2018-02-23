package com.design.patterns.observer.weather.station.base;

import com.design.patterns.observer.weather.station.observers.MyObserver;

/**
 * Created by himu on 2/23/2018.
 */
public interface Subject {

    public void addObserver(MyObserver observer);
    public void removeObserver(MyObserver observer);
    public void notifyObservers();
}
