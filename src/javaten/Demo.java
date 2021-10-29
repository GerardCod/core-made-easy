package javaten;

import java.util.ArrayList;

public class Demo {
  public static void main(String[] args) {
    var list = new ArrayList<String>();
    list.add("fefe");
    list.add("fefe");
    list.add("fefe");
    list.add("fefe");
    list.add("fefe");

    for (var string : list) {
      System.out.println(string);
    }
  }
}
