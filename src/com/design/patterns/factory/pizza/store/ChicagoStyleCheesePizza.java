package com.design.patterns.factory.pizza.store;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing chicago stype cheese pizza with  thick crust, rich sauce and lotta cheese!!");
    }
}
