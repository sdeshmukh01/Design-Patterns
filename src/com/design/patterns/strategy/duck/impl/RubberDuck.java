package com.design.patterns.strategy.duck.impl;

import com.design.patterns.strategy.duck.Duck;
import com.design.patterns.strategy.duck.FlyingBehaviour;
import com.design.patterns.strategy.duck.QuackBehaviour;

/**
 * Created by himu on 2/23/2018.
 */
public class RubberDuck extends Duck {
    public RubberDuck(FlyingBehaviour flyingBehaviour, QuackBehaviour quackBehaviour) {
        super(flyingBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

}
