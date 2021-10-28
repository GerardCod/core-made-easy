package assingments.abstraction;

public class Test {
  public static void main(String[] args) {
    TouchScreenLaptop laptop = new DELLNotebook();
    laptop.scroll();
    laptop.click();

    laptop = new HPNotebook();
    laptop.scroll();
    laptop.click();

  }
}
