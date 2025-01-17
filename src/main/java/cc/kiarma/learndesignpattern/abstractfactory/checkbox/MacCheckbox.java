package cc.kiarma.learndesignpattern.abstractfactory.checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("创建一个mac风格的checkbox");
    }
}
