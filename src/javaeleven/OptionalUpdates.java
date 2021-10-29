package javaeleven;

import java.util.Optional;

public class OptionalUpdates {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hola mundo");
        System.out.println(optionalString.isEmpty());
        System.out.println(optionalString.get());
    }
}
