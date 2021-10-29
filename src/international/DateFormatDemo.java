package international;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
        DateFormat ukDF = DateFormat.getDateInstance(0, Locale.UK);
        
        System.out.println(usDF.format(date));
        System.out.println(ukDF.format(date));

        DateFormat timeInstance = DateFormat.getTimeInstance(0);
        System.out.println(timeInstance.format(date));
    }
}
