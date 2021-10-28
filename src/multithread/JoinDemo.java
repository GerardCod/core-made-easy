package multithread;

import java.util.Scanner;

public class JoinDemo extends Thread {
  
  static int n, sum = 0;
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    System.out.println("Sum of first 'N' numbers");
    System.out.println("Enter a positive integer number");
    Scanner scan = new Scanner(System.in);
    JoinDemo.n = scan.nextInt();

    JoinDemo instance = new JoinDemo();
    instance.start();

    try {
      instance.join();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }

    scan.close();
    System.out.println("Sum of first 'N' numbers: " + JoinDemo.sum);
    long end = System.currentTimeMillis();
    System.out.println("Time taken to finish the program: " + (end - start) + "ms");
  }

  public void run() {
    for (int i = 0; i <= JoinDemo.n; i++) {
      JoinDemo.sum += i;
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
