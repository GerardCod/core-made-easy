package international;

import java.util.Locale;

public class InternationalTest {
    public static void main(String[] args) {
        Locale l = Locale.getDefault();

        System.out.println(l.getCountry() + " " + l.getLanguage());
        System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
        
        Locale.setDefault(Locale.UK);
        System.out.println(Locale.getDefault().getCountry() + " " + Locale.getDefault().getLanguage());
        System.out.println(Locale.getDefault().getDisplayCountry() + " " + Locale.getDefault().getDisplayLanguage());
    
        String[] isoCountries = Locale.getISOCountries();
        for (String string : isoCountries) {
            System.out.println(string);
        }

        String[] languages = Locale.getISOLanguages();
        for (String string : languages) {
            System.out.println(string);
        }
    }
}
