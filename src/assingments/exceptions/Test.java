package assingments.exceptions;

public class Test {
  public static void main(String[] args) {
    try {
      Thread.sleep(2000L);
      throw new InterruptedException("Main thread interrupted");

    } catch (InterruptedException ie) {
      throw new MyThreadException(ie.getMessage());
    } catch (MyThreadException e) {
      System.out.println(e.getMessage());
    }
  }
}