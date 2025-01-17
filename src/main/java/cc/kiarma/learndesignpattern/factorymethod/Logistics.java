package cc.kiarma.learndesignpattern.factorymethod;

/**
 * 物流
 */
public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransports();
        transport.deliver();
    }

    protected abstract Transport createTransports();
}
