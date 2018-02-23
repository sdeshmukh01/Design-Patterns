package com.design.patterns.factory.pizza.store;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style pepperoni pizza with pepperoni and mozzaralla cheese");
    }
}
