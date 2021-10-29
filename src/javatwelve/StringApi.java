package javatwelve;

public class StringApi {
    public static void main(String[] args) {
        String phrase = "The power is with you, you can do anything you want";
        System.out.println(phrase);
        System.out.println("After identation " + phrase.indent(5));
        System.out.println("After identation " + phrase.indent(-2));

        String stringNumber = "10";
        Integer number = stringNumber.transform(Integer::valueOf);
        System.out.println(number);
    }
}
