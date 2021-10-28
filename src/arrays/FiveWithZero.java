package arrays;

public class FiveWithZero {
  public static void main(String[] args) {
    int a[] = {3, 4, 6, 3, 5, 7, 3};
    
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] == 3 && a[i + 1] == 5) {
        a[i + 1] = 0;
      }
    }

    for (int i : a) {
      System.out.println(i);
    }
  }
}
