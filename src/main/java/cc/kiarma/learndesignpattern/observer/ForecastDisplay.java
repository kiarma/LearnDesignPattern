package cc.kiarma.learndesignpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Display, Observer {

    private Observable obs;

    public ForecastDisplay(Observable obs) {
        this.obs = obs;
        this.obs.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("ForecastDisplay");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ForecastDisplay update =>" + o.toString());
    }
}
