package com.design.patterns.strategy.game;

/**
 * Created by himu on 2/23/2018.
 */
public class Character
{

    private WeaponBehaviour weaponBehaviour;

    public Character(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public WeaponBehaviour getWeaponBehaviour() {
        return weaponBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void peformFight(){
        weaponBehaviour.fight();
    }

}
