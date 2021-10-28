package interrupt;

public class MyThread extends Thread {

  public void run() {
    try {
      for (int i = 0; i <= 10; i++) {
        System.out.println("I'm a lazy thread");
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
