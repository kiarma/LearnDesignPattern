package cc.kiarma.learndesignpattern.abstractfactory.factory;

import cc.kiarma.learndesignpattern.abstractfactory.button.Button;
import cc.kiarma.learndesignpattern.abstractfactory.button.WindowsButton;
import cc.kiarma.learndesignpattern.abstractfactory.checkbox.Checkbox;
import cc.kiarma.learndesignpattern.abstractfactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
