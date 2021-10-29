package assingments;

import java.text.NumberFormat;
import java.util.Locale;

public class International {
    public static void main(String[] args) {
        Double number = 789654.456;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        NumberFormat uk = NumberFormat.getInstance(Locale.UK);

        System.out.println("US: " + us.format(number));
        System.out.println("UK: " + uk.format(number));
    }
}
