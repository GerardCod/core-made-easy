package assingments;

import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    char[] listOfChar = {'a', 'z', 'b', 'c', 'f', 'h', 'g'};

    int index = Arrays.binarySearch(listOfChar, 'c');
    System.out.println("The key is at the index: " + index);
  }
}
