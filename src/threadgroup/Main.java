package threadgroup;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    ThreadGroup mgp = new ThreadGroup("MyThreadGroup");
    
    CustomThread ct1 = new CustomThread(mgp, "Thread 1"); 
    CustomThread ct2 = new CustomThread(mgp, "Thread 2"); 
    CustomThread ct3 = new CustomThread(mgp, "Thread 3"); 
    
    ct1.start();
    ct2.start();
    ct3.start();

    System.out.println(mgp.activeCount());
    mgp.list();
    
    Thread.sleep(5000);
    System.out.println(mgp.activeCount());
    mgp.list();
  }
}
