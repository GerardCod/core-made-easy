package javafourteen;

public class StringContentBlockDemo {
    public static void main(String[] args) {
        String template = """
                          {
                              "name": "Gerardo Adalberto Aguilar Calderón",
                              "age": 22,
                          }
                          """;
        System.out.println(template);
    }
}
