package cc.kiarma.learndesignpattern.abstractfactory.factory;

import cc.kiarma.learndesignpattern.abstractfactory.button.Button;
import cc.kiarma.learndesignpattern.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
