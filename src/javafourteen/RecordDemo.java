package javafourteen;

public class RecordDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Gerardo", 25000);
        System.out.println(emp.name());
        System.out.println(emp.sal());
        System.out.println(emp);
    }
}
