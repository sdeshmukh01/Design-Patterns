package com.design.patterns.factory.pizza.store;

/**
 * Created by himu on 2/23/2018.
 */
public abstract class PizzaStore {

    public void orderPizza(String type){
    Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String type);

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("Cheese");
        store.orderPizza("Greek");
//        store.orderPizza("Pepperoni");
//        PizzaStore store2 = new ChicagoPizzaStore();
//        store2.orderPizza("Greek");
//        store2.orderPizza("Pepperoni");
//        store2.orderPizza("Cheese");
    }
}
