package enums;

public enum PaymentType {
  CREDIT_CARD(0), CASH(5), PAYPAL(2);

  private int fee;

  PaymentType(int fee) {
    this.fee = fee;
  }

  public int getFee() {
    return this.fee;
  }
}
