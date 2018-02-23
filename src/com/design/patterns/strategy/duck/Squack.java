package com.design.patterns.strategy.duck;

/**
 * Created by himu on 2/23/2018.
 */
public class Squack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squacking");
    }
}
