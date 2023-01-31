import java.time.LocalDate;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Tester {


    public static void main(String[] args) {

        LocalDate a=LocalDate.now();
        Year thisYear = Year.of(2023);
        System.out.println(a.lengthOfMonth()-a.getDayOfYear());

        System.out.println(thisYear.length()-a.getDayOfYear());






    }
}

/**
 * Using LocaleDate, calculate and print:
 * how many days are left till the end of the month
 * how many days are left till the end of the year, using the length() method from java.time.Year.of()
 */