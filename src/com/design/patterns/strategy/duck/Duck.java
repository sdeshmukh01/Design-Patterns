package com.design.patterns.strategy.duck;

/**
 * Created by himu on 2/23/2018.
 */
public abstract class Duck {


    private FlyingBehaviour flyingBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyingBehaviour flyingBehaviour, QuackBehaviour quackBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return flyingBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println(" Duck Swimming");
    }

    public void performFy(){
        flyingBehaviour.fly();
    }

    public abstract void  display();
}
