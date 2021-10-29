package regex;

import java.util.regex.Pattern;

public class QuantifiersAndModifiers {
  public static void main(String[] args) {
    System.out.println(Pattern.matches("[abc]*", "ab"));
    System.out.println(Pattern.matches("\\d", "1"));
    System.out.println(Pattern.matches("\\D", "1"));
    System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test1"));
  }
}
