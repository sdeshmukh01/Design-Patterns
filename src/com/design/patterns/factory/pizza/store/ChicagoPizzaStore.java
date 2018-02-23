package com.design.patterns.factory.pizza.store;

public class ChicagoPizzaStore extends PizzaStore {




    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Cheese")) {

            return new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("Greek")) {
            return new ChicagoStyleGreekPizza();
        } else return null;
    }
}
