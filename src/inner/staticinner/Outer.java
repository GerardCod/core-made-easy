package inner.staticinner;

public class Outer {
  static void f1() {
    System.out.println("Outer class static method");
  }
  
  static class Inner {
    static void m2(){
      System.out.println("Inner class static method");
    }
    
    void m3() {
      System.out.println("Inner class non-static method");
    }
  }

  public static void main(String[] args) {
    Outer.f1();
    Outer.Inner.m2();

    Outer.Inner inner = new Outer.Inner();
    inner.m3();
  }
}
