package com.design.patterns.strategy.game;

/**
 * Created by himu on 2/23/2018.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("King fightin");
        Character character = new King(new AxeBehaviour());
        character.peformFight();
        System.out.println("Knight fightin");
        character = new Knight(new SwordBehaviour());
        character.peformFight();

    }
}
