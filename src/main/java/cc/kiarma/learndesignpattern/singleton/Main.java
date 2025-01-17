package cc.kiarma.learndesignpattern.singleton;

public class Main {

    public static void main(String[] args) {
        // 创建多个线程同时获取单例实例
        Runnable task = ()->{
            Singleton singleton = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + singleton);
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
