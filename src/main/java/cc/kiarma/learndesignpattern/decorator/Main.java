package cc.kiarma.learndesignpattern.decorator;

import java.io.BufferedInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception{
        int c;
        try (LowercaseInputStream in = new LowercaseInputStream(new BufferedInputStream(Files.newInputStream(Paths.get("read_test.txt"))))) {
            while ((c = in.read()) > -1) {
                System.out.print((char) c);
            }
        }
    }
}
