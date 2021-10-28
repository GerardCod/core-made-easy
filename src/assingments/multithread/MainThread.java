package assingments.multithread;

public class MainThread {
  public static void main(String[] args) throws InterruptedException {
    EvenNumberThread even = new EvenNumberThread();
    OddNumberThread odd = new OddNumberThread();

    Thread evenThread = new Thread(even);
    Thread oddThread = new Thread(odd);

    evenThread.start();
    oddThread.start();

    evenThread.join();
    oddThread.join();

    for (int i = 0; i <= 10; i++) {
      System.out.println("Main: " + i);
    }
  }
}
