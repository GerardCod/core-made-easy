package threadgroup;

public class CustomThread extends Thread {
  
  public CustomThread(ThreadGroup gp, String name) {
    super(gp, name);
  }

  public void run() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
}
