package immutable;

public class MyImmutable {
  private int x;

  public MyImmutable(int x) {
    this.x = x;
  }

  public MyImmutable change(int x) {
    if (this.x == x) {
      return this;
    }

    return new MyImmutable(x);
  }

  public static void main(String[] args) {
    MyImmutable referenceOne = new MyImmutable(20);
    MyImmutable referenceTwo = referenceOne.change(20);
    System.out.println(referenceOne == referenceTwo);

    MyImmutable referenceThree = referenceTwo.change(50);
    System.out.println(referenceThree == referenceTwo);
  }
}
