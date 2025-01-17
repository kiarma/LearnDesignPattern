package cc.kiarma.learndesignpattern.factorymethod;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransports() {
        return new ShipTransport();
    }
}
