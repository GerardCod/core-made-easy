package javafourteen;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = get();
        
        if (obj instanceof String str) {
            System.out.println(str);
        }
    }

    public static Object get() {
        return "Pattern matching demo";
    }
}
