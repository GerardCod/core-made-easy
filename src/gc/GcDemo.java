package gc;

public class GcDemo {
  private int objId;

  public GcDemo(int objId) {
    this.objId = objId;
    System.out.println(this.objId + " Created.");
  }
  public static void main(String[] args) {

    new GcDemo(10);
    new GcDemo(20);
    
    System.gc();
  }

  protected void finalize() {
    System.out.println(this.objId + " Finalized.");
  }
}