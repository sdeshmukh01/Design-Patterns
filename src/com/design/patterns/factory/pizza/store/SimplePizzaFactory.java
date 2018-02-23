package com.design.patterns.factory.pizza.store;

public class SimplePizzaFactory {


    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Cheese")) {

            return new CheesePizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new Pepperoni();
        } else if (type.equalsIgnoreCase("Greek")) {
            return new GreekPizza();
        } else return null;
    }
}
