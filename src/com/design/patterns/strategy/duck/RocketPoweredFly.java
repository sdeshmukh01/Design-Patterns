package com.design.patterns.strategy.duck;

/**
 * Created by himu on 2/23/2018.
 */
public class RocketPoweredFly implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Rocket Powered Flying");
    }
}
