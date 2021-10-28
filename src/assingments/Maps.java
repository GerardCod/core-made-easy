package assingments;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Maps {
  public static void main(String[] args) {
    NavigableMap<String, Integer> map = new TreeMap<>();
  
    map.put("g", 1000);
    map.put("a", 2000);
    map.put("d", 1450);
    map.put("w", 7836);
    map.put("y", 4723);
    map.put("n", 2789);
    map.put("z", 3168);

    System.out.println(map.floorKey("w"));
    System.out.println(map.lowerKey("g"));
    System.out.println(map.ceilingKey("z"));
    System.out.println(map.higherKey("d"));
    System.out.println(map.pollFirstEntry());
    System.out.println(map.pollLastEntry());
    System.out.println(map.descendingMap());
  }
}
