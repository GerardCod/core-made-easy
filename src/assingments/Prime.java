package assingments;

public class Prime {
  public static void main(String[] args) {
    Integer number = Integer.parseInt(args[0]);
    boolean isPrime = true;
    int i = 2;

    while (isPrime && i < number) {
      if (number % i == 0) {
        isPrime = false;
      }

      i++;
    }

    String output = String.format("Is the number %d prime? %b", number, isPrime);
    System.out.println(output);
  }
}
