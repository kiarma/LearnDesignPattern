package cc.kiarma.learndesignpattern.factorymethod;

public class TruckTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("我是陆运汽车, 出发咯...");
    }
}
