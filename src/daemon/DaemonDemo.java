package daemon;

/**
 * Esta es una clase para ver comportamiento de los hilos cuando se definen como un Daemon.
 */
public class DaemonDemo {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().isDaemon());
    
    MyThread thread = new MyThread();
    thread.setDaemon(true);
    System.out.println(thread.isDaemon());
    thread.start();
  }
}
