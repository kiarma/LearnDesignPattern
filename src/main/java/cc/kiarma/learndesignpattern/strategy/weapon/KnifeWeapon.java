package cc.kiarma.learndesignpattern.strategy.weapon;

public class KnifeWeapon implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("用匕首刺");
    }
}
