package cc.kiarma.learndesignpattern.factorymethod;

public class ShipTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("我是海运邮轮, 扬帆起航...");
    }
}
