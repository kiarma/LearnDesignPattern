package cc.kiarma.learndesignpattern.abstractfactory.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("创建一个windows风格的button...");
    }
}
