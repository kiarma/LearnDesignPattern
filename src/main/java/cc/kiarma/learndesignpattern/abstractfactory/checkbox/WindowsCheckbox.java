package cc.kiarma.learndesignpattern.abstractfactory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("创建一个windows风格的checkbox");
    }
}
