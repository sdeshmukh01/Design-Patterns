package com.design.patterns.factory.pizza.store;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Cheese")) {

            return new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("Greek")) {
            return new NYStyleGreekPizza();
        } else return null;
    }
}
