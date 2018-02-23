package com.design.patterns.factory.pizza.store;

/**
 * Created by himu on 2/23/2018.
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Greek pizza");
    }
}
