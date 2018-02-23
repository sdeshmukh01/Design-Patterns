package com.design.patterns.decorator.coffee.shop.entities.condiments;

import com.design.patterns.decorator.coffee.shop.base.Bevarage;

/**
 * Created by himu on 2/23/2018.
 */
public class Mocha extends Bevarage {

    private Bevarage bevarage;
   public Mocha(Bevarage bevarage){
       this.bevarage = bevarage;
   }
    @Override
    public String getDescription() {
        return bevarage.getDescription()+" Mocha";
    }

    @Override
    public double getCost() {
        return bevarage.getCost()+.20;
    }
}
