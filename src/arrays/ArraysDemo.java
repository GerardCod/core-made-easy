package arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    // Formas de declarar un arreglo.
    
    //int arr[5];
    
    //int arr[] = {10, 20, 30, 40, 50};

    int arr[] = new int[5];

    arr[0] = 10;
    arr[1] = Integer.valueOf(20); // Autoboxing
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    System.out.println("Elements of the array");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i);
    }
    
    System.out.println("Elements of the array");
    for (int i : arr) {
      System.out.println(i);
    }


    long[] arr1 = new long[4];
    for (long l : arr1) {
      System.out.println(l);
    }
  }
}
