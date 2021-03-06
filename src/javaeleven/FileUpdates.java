package javaeleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {
    public static void main(String[] args) {
        try {
            Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 is cool");
            System.out.println(path);
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
