package cc.kiarma.learndesignpattern.factorymethod;

public class Main {

    public static void main(String[] args) {
        RoadLogistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        SeaLogistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
