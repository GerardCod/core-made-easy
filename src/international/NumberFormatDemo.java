package international;

import java.text.NumberFormat;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Double d = 12345.789;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(d));
    }
}
