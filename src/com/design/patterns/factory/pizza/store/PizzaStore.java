package com.design.patterns.factory.pizza.store;

/**
 * Created by himu on 2/23/2018.
 */
public class PizzaStore {


    public void orderPizza(String type){
        Pizza pizza;
        if(type == "Cheese"){
            pizza = new CheesePizza();
        }
        else if(type == "Greek"){
            pizza = new GreekPizza();
        }
        else pizza = new Pepperoni();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza("Cheese");

    }
}
