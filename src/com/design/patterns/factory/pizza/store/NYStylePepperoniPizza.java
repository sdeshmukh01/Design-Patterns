package com.design.patterns.factory.pizza.store;

public class NYStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing Ny Style Pepperoni pizza with Just red pepperoni");
    }
}
