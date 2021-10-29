package international;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date);

        String stringDate = "28/11/2021";
        Date today = sdf.parse(stringDate);
        System.out.println(today);
    }
}
