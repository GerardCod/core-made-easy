package interrupt;

public class Main {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();

    thread.interrupt();
    System.out.println("End of the program");
  }
}
