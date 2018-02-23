package com.design.patterns.strategy.duck;

/**
 * Created by himu on 2/23/2018.
 */
public class FlyWithWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Ducks flying with wings open");
    }
}
