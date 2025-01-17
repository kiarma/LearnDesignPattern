package cc.kiarma.learndesignpattern.abstractfactory.factory;

import cc.kiarma.learndesignpattern.abstractfactory.button.Button;
import cc.kiarma.learndesignpattern.abstractfactory.button.MacButton;
import cc.kiarma.learndesignpattern.abstractfactory.checkbox.Checkbox;
import cc.kiarma.learndesignpattern.abstractfactory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
