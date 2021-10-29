package javanine.collections;

import java.util.List;
import java.util.Set;

public class Demo {
  public static void main(String[] args) {
    List<String> names = List.of("Gerardo", "Lucia", "Mariana");
    Set<String> namesSet = Set.of("abc", "xyz");

    names.add("fefe");
  }
}
