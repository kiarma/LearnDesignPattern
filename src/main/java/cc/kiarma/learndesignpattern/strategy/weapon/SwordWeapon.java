package cc.kiarma.learndesignpattern.strategy.weapon;

public class SwordWeapon implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("用剑劈砍");
    }
}
