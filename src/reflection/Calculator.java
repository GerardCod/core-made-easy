package reflection;

public class Calculator {
  private double numOne;
  private double numTwo;

  public Calculator(double numOne, double numTwo) {
    this.numOne = numOne;
    this.numTwo = numTwo;
  }

  public Calculator() {
    this.numOne = 0;
    this.numTwo = 0;
  }

  public double getNumOne() {
    return this.numOne;
  }

  public void setNumOne(double numOne) {
    this.numOne = numOne;
  }

  public double getNumTwo() {
    return this.numTwo;
  }

  public void setNumTwo(double numTwo) {
    this.numTwo = numTwo;
  }

  public double sum(double a, double b) {
    return a + b;
  }
}
