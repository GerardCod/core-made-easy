package javanine;

public class SendNotificationsImpl implements SendNotification {
  public static void main(String[] args) {
    SendNotificationsImpl impl = new SendNotificationsImpl();
    impl.sendNotification();
    SendNotification.sendNotifications();;
  }
}
