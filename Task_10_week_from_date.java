import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task_10_week_from_date {
    public static void main(String[] args)
    {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.YEAR, 2020);
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.getTime());

    }
}
