package com.design.patterns.strategy.duck;

import com.design.patterns.strategy.duck.impl.RubberDuck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new RubberDuck(new NoFly(), new Squack());
        duck.display();
        duck.swim();
        duck.performFy();
        duck.performQuack();
        duck.setFlyingBehaviour(new RocketPoweredFly());
        duck.performFy();
    }
}
