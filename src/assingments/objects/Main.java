package assingments.objects;

public class Main {
  public static void main(String[] args) {
    PowerBill bill = new PowerBill(15, "Gerardo", "Calle Siempre viva 2434");
    PowerBill bill1 = new PowerBill(15, "Gerardo", "Calle Siempre viva 2434");
    

    System.out.println(bill);
    System.out.println(bill1);
    System.out.println(bill.equals(bill1));
  }
}
