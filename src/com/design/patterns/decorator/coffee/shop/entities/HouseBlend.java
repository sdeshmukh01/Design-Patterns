package com.design.patterns.decorator.coffee.shop.entities;

import com.design.patterns.decorator.coffee.shop.base.Bevarage;

/**
 * Created by himu on 2/23/2018.
 */
public class HouseBlend extends Bevarage {

    public HouseBlend(){
        description = "House Blend coffee";
    }
    @Override
    public double getCost() {
        return .90;
    }
}
