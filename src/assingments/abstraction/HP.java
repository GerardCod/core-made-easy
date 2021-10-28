package assingments.abstraction;

public abstract class HP implements TouchScreenLaptop {
  
  @Override
  public void scroll() {
    System.out.println("Scrolling from a HP Laptop");
  }

}
