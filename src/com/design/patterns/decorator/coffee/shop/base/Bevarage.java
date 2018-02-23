package com.design.patterns.decorator.coffee.shop.base;

/**
 * Created by himu on 2/23/2018.
 */
public abstract class Bevarage {

    protected String description;
    protected double cost;

    public String getDescription(){
        return description;
    }

    public abstract double getCost();


}
