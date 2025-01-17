package cc.kiarma.learndesignpattern.abstractfactory.button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("创建一个mac风格的button...");
    }
}
