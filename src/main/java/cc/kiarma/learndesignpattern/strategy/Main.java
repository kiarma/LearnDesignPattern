package cc.kiarma.learndesignpattern.strategy;

import cc.kiarma.learndesignpattern.strategy.weapon.AxeWeapon;

public class Main {

    public static void main(String[] args) {
        DarkKnight dk = new DarkKnight();
        dk.fight();
        dk.setWeapon(new AxeWeapon());
        dk.fight();
    }
}
