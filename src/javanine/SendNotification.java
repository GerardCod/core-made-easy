package javanine;

public interface SendNotification {

  static void sendNotifications() {
    establishConnection();
    System.out.println("Sending multiple notifications");
  }
  
  default void sendNotification() {
    establishConnection();
    System.out.println("Sending a notification");
  }
  
  private static void establishConnection() {
    System.out.println("Establishing a connection");
  }
}
