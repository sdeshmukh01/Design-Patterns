package com.design.patterns.decorator.coffee.shop.entities.condiments;

import com.design.patterns.decorator.coffee.shop.base.Bevarage;

/**
 * Created by himu on 2/23/2018.
 */
public class Whip extends Bevarage {

    private Bevarage bevarage;

    public Whip(Bevarage bevarage){
    this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription()+" Whip";
    }

    @Override
    public double getCost() {
        return 0.15+bevarage.getCost();
    }
}
