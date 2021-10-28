package events.test;

import events.dto.Event;
import events.dto.Organizer;

public class Test {
  public static void main(String[] args) {
    Organizer org = new Organizer();
    org.id = 123L;
    org.name = "Apple Inc";
    
    System.out.println(org);
    System.out.println(org.name);

    Event event = new Event(3214L, "New iPhone release", "Grand release");
    System.out.println(event.description);
  }
}
