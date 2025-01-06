package cc.kiarma.learndesignpattern.strategy.weapon;

public class AxeWeapon implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("用斧头砍");
    }
}
