package cc.kiarma.learndesignpattern.factorymethod;

public class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransports() {
        return new TruckTransport();
    }
}
