package com.design.patterns.factory.pizza.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by himu on 2/23/2018.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String  sauce;
    List<String> toppings  = new ArrayList();

    public void prepare(){
        System.out.println("Preparing: "+name);
        System.out.println("Toasting dough: "+dough);
        System.out.println("adding sauce: "+sauce);
        System.out.println("Adding toppings: ");
        toppings.forEach( s -> System.out.println(s));
    }
    public void bake(){
        System.out.println("bake for 25 mins at 350*");
    }
    public void cut(){
        System.out.println("Cutting Pizza in digonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official pizza store box");
    }

}
