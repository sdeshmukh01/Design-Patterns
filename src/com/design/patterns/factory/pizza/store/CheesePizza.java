package com.design.patterns.factory.pizza.store;

/**
 * Created by himu on 2/23/2018.
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }
}
