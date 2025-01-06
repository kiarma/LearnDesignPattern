package cc.kiarma.learndesignpattern.strategy.weapon;

public class BowAndArrowWeapon implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("用弓箭射击");
    }
}
