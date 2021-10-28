package inner.nonstatic;

public class Outer {
  private static int x = 50;
  private int y;

  public Outer(int y) {
    this.y = y;
  }

  void m1() {
    System.out.println("Inside non-static method of Outer class");
  }

  class Inner {
    private int y;

    Inner(int y) {
      this.y = y;
    }

    private void f2() {
      System.out.println("Outer class x: " + Outer.x);
      System.out.println("Outer class y: " + Outer.this.y);
      System.out.println("Inner class y: " + this.y);
    }
  }

  public static void main(String[] args) {
    Outer outer = new Outer(80);
    outer.m1();

    Outer.Inner inner = outer.new Inner(40);
    inner.f2();

    System.out.println(inner.y);
  }
}
