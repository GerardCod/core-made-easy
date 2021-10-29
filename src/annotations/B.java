package annotations;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(value = { "deprecation", "rawtypes" })
public class B {
    public static void main(String[] args) {
        A object = new A();
        object.myMethod();
        System.out.println(object.a);

        List list = new ArrayList();
        System.out.println(list);
    }
}
