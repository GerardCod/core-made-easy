package javafourteen;

public class SwitchExpressionsDemo {
    public static void main(String[] args) {
        int key = 2;
        String result = switch (key) {
            case 1:
                yield "Choice one";
        
            default:
                yield "Invalid choice";
        };

        System.out.println(result);
    
        int choice = 1;

        String response = switch(choice) {
            case 1 -> {
                yield "You have zero balance";
            }
            case 2 -> {
                yield "You apply for a loan";
            }

            default -> {
                yield "Invalid choice";
            }
        };

        System.out.println(response);
    }
}
