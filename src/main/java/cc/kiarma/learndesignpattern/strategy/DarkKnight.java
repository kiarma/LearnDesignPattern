package cc.kiarma.learndesignpattern.strategy;

import cc.kiarma.learndesignpattern.strategy.weapon.KnifeWeapon;
import cc.kiarma.learndesignpattern.strategy.weapon.Weapon;

public class DarkKnight extends BaseCharacter{
    @Override
    void fight() {
        weapon.useWeapon();
    }

    public DarkKnight() {
        setWeapon(new KnifeWeapon());
    }
}
