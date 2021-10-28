package assingments.objects;

public class PowerBill {
  private int meterNo;
  private String name;
  private String address;

  public PowerBill(int meterNo, String name, String address) {
    this.meterNo = meterNo;
    this.name = name;
    this.address = address;
  }

  @Override
  public String toString() {
    String info = String.format("[MeterNo= %d, Name= %s, Address=%s]", meterNo, name, address);
    return info;
  }

  @Override
  public int hashCode() {
    return meterNo;
  }

  @Override
  public boolean equals(Object obj) {
    PowerBill otherBill = (PowerBill) obj;
    return this.meterNo == otherBill.meterNo;
  }
}
