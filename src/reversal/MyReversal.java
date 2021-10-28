package reversal;

public class MyReversal {

  public String firstWay(String current) {
    String reverse = "";
    
    for (int i = current.length() - 1; i >= 0; i--) {
      reverse += current.charAt(i);
    }
  
    return reverse;
  }

  public String secondWay(String current) {
    byte[] s1 = current.getBytes();
    byte[] reverse = new byte[s1.length];

    for (int i = 0; i < s1.length; i++) {
      reverse[i] = s1[s1.length - (i + 1)];
    }

    return new String(reverse);
  }

  public static void main(String[] args) {
    String name = "Gerardo";
    MyReversal reverse = new MyReversal();
    System.out.println(reverse.firstWay(name));
    System.out.println(reverse.secondWay(name));
  }
}
