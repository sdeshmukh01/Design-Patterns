package com.design.patterns.factory.pizza.store;

/**
 * Created by himu on 2/23/2018.
 */
public abstract class Pizza {

    public abstract void prepare();
    public void bake(){
        System.out.println("baking pizza");
    }
    public void cut(){
        System.out.println("Cutting Pizza");
    }
    public void box(){
        System.out.println("Boxing in square boxes");
    }

}
