package sync;

public class DisplayMessage {
  public void sayHello(String name) {
    
    synchronized(this) {
      for (int i = 0; i <= 10; i++) {
        System.out.println("How are you " + name + "?");
      }
    }

  }
}
