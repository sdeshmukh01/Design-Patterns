package com.design.patterns.factory.pizza.store;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){

        dough = "Thin Crust";
        name = "Ny Style Cheese pizza";
        sauce = "Marinated Sauce";
        toppings.add("Clams");
        toppings.add("Mozarrala cheese");
    }
}
