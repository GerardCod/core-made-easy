package sync;

public class MyThread extends Thread {
  
  DisplayMessage display;
  String name;

  public MyThread(DisplayMessage display, String name) {
    this.display = display;
    this.name = name;
  }

  public void run() {
    display.sayHello(name);
  }
}
