package com.design.patterns.strategy.game;

/**
 * Created by himu on 2/23/2018.
 */
public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void fight() {
        System.out.println("Fight with sword");
    }
}
