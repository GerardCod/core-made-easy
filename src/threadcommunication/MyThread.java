package threadcommunication;

public class MyThread extends Thread {
  int total;
  
  public void run() {
    System.out.println("Child thread is calculating the sum");

    synchronized(this) {
      for (int i = 0; i <= 100; i++) {
        total += i;
      }
      this.notify();
    }
  }
}
