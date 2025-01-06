package cc.kiarma.learndesignpattern.strategy;

import cc.kiarma.learndesignpattern.strategy.weapon.Weapon;

public abstract class BaseCharacter {

    Weapon weapon;

    abstract void fight();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
