package enums;

public class Test {
  public static void main(String[] args) {
    PaymentType type = PaymentType.PAYPAL;

    System.out.println(type);

    PaymentType[] types = PaymentType.values();
    for (PaymentType paymentType : types) {
      System.out.println(paymentType);
      System.out.println(paymentType.ordinal());
      System.out.println(paymentType.getFee());
    }
  }
}
