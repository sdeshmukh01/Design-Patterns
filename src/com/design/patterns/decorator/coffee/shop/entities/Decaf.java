package com.design.patterns.decorator.coffee.shop.entities;

import com.design.patterns.decorator.coffee.shop.base.Bevarage;

/**
 * Created by himu on 2/23/2018.
 */
public class Decaf extends Bevarage
{
    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double getCost() {
        return 1.29;
    }
}
