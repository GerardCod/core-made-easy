package events.managers;

import events.dto.Event;

public class EventManagerImpl implements EventManager {

  @Override
  public Event create(Long id) {
    Event event = new Event(id, "New Event", "Some cool event");
    return event;
  }
  
}
