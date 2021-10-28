package multithread;

public class MultiThread extends Thread {
  
  public static void main(String[] args) throws InterruptedException {
    MultiThread multi = new MultiThread();
    MultiThread mt2 = new MultiThread();
    multi.setPriority(MIN_PRIORITY);
    multi.setName("mt1");

    mt2.setPriority(MAX_PRIORITY);
    mt2.setName("mt2");
    
    
    multi.start();
    mt2.start();
    /* for (int j = 0; j < 100; j++) {
      System.out.print("j: " + j + "\t");
      Thread.sleep(350);
    } */
  }
  
  public void run() {
    Thread currentThread = Thread.currentThread();
    System.out.println(currentThread.getName());
/*     for (int i = 0; i < 100; i++) {
      System.out.print("i: " + i + "\t");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    } */
  }
}
