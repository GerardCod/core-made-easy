package sync;

public class SynchronizationDemo {
  public static void main(String[] args) {
    DisplayMessage displayMessage = new DisplayMessage();

    MyThread t1 = new MyThread(displayMessage, "Mark");
    MyThread t2 = new MyThread(displayMessage, "Ethan");

    t2.start();
    t1.start();
  }
}
