package cc.kiarma.learndesignpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Display, Observer {

    private Observable obs;

    public GeneralDisplay(Observable obs) {
        this.obs = obs;
        this.obs.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("GeneralDisplay");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("GeneralDisplay update =>" + o.toString());
    }
}
