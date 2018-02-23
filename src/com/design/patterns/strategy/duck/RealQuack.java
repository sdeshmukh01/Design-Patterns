package com.design.patterns.strategy.duck;

/**
 * Created by himu on 2/23/2018.
 */
public class RealQuack  implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Duck Quacking");
    }
}
