package com.design.patterns.factory.pizza.store;

public class NYStyleGreekPizza extends Pizza {
    public NYStyleGreekPizza() {
        dough = "Thick Crust";
        name = "Ny Style Greek pizza";
        sauce = "Double Marinated Sauce";
        toppings.add("Grated Cheese");
        toppings.add("Veggies");
    }
}
