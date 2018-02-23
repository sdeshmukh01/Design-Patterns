package com.design.patterns.decorator.coffee.shop.execute;

import com.design.patterns.decorator.coffee.shop.base.Bevarage;
import com.design.patterns.decorator.coffee.shop.entities.DarkRoast;
import com.design.patterns.decorator.coffee.shop.entities.Expresso;
import com.design.patterns.decorator.coffee.shop.entities.HouseBlend;
import com.design.patterns.decorator.coffee.shop.entities.condiments.Mocha;
import com.design.patterns.decorator.coffee.shop.entities.condiments.Whip;

/**
 * Created by himu on 2/23/2018.
 */
public class StarBuzzCoffee {


    public static void main(String[] args) {
        Bevarage bevarage
                 = new Expresso();
        System.out.println(bevarage.getDescription() +" $"+bevarage.getCost());
        Bevarage bevarage2 = new DarkRoast();
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Whip(bevarage2);

        System.out.println(bevarage2.getDescription() +" $"+bevarage2.getCost());

        Bevarage bevarage3 = new HouseBlend();
        bevarage3 = new Mocha(bevarage3);
        bevarage3 = new Whip(bevarage3);
        System.out.println(bevarage3.getDescription() +" $"+bevarage3.getCost());


    }
}
