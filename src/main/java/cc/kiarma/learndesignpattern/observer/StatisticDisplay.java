package cc.kiarma.learndesignpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Display, Observer {

    private Observable obs;

    public StatisticDisplay(Observable obs) {
        this.obs = obs;
        this.obs.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("StatisticDisplay");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("StatisticDisplay update =>" + o.toString());
    }
}
