package cc.kiarma.learndesignpattern.abstractfactory.app;

import cc.kiarma.learndesignpattern.abstractfactory.button.Button;
import cc.kiarma.learndesignpattern.abstractfactory.checkbox.Checkbox;
import cc.kiarma.learndesignpattern.abstractfactory.factory.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
