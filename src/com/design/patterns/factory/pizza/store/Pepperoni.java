package com.design.patterns.factory.pizza.store;

/**
 * Created by himu on 2/23/2018.
 */
public class Pepperoni extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni pizza");
    }
}
