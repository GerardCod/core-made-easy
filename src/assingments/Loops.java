package assingments;

import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a positive integer number:");
    int number = scan.nextInt();
    int i = 0;
    
    while (i <= number) {
      if (i > 100) {
        break;
      }

      if (i % 10 == 0) {
        i++;
        continue;
      }

      System.out.println(i);
      i++;
    }

    scan.close();
  }
}
