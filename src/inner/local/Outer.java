package inner.local;

public class Outer {
  void f1() {
    System.out.println("Inside outer class method");

    class LocalInner {
      void f2() {
        System.out.println("Inside local inner class");
      }
    }

    new LocalInner().f2();
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.f1();
  }
}
