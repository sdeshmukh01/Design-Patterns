package com.design.patterns.factory.pizza.store;

public class ChicagoStyleGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style greek pizza with lot of veg toppings, dry cheese and red sauce!!");
    }
}
