package concurrent.producer;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

  private BlockingQueue<String> queue;

  public OrderProducer(BlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    try {
      queue.put("MacBook Pro");
      queue.put("Dell Laptop");
      queue.put("iPhone");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
