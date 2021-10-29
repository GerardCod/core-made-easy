package javaeleven;

import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {
        String str = "                fefef";
        System.out.println(str.isBlank());

        str = "I \n am the \n creator of my destiny";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
        char c = '\u2000';
        System.out.println(c);
        System.out.println("-".repeat(50));
    }
}
