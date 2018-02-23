package com.design.patterns.decorator.coffee.shop.entities;

import com.design.patterns.decorator.coffee.shop.base.Bevarage;

/**
 * Created by himu on 2/23/2018.
 */
public class DarkRoast extends Bevarage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public double getCost() {
        return 1.25;
    }
}
