package javatwelve;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsApi {
    public static void main(String[] args) {
        Result collection = Stream.of(1, 20, 45, 97, 2).collect(Collectors.teeing(Collectors.counting(), 
        Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()), Result::new));
        System.out.println(collection);
    }
}
