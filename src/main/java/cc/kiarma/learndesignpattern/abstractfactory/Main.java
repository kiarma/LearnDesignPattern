package cc.kiarma.learndesignpattern.abstractfactory;

import cc.kiarma.learndesignpattern.abstractfactory.app.Application;
import cc.kiarma.learndesignpattern.abstractfactory.factory.MacFactory;
import cc.kiarma.learndesignpattern.abstractfactory.factory.WindowsFactory;

public class Main {

    public static void main(String[] args) {

        Application app = new Application(new WindowsFactory());
        app.paint();

        app = new Application(new MacFactory());
        app.paint();
    }
}
