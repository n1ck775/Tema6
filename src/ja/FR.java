package ja;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FR {

    public static void main(String[] args) {

        Locale[] locales = new Locale[]{Locale.ENGLISH,
            new Locale("fr", "FR"),
            new Locale("us", "US"),
            new Locale("es", "ES"),
            new Locale("de", "DE"),};



        for (Locale locale : locales) {
            System.out.println("Short date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

    }
}
