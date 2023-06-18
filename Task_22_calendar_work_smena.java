import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task_22_calendar_work_smena {
    public static void main(String[] args) {
        int work = 0;

        for (int i = 1; i < 366; i++) {
            Date date = new Date(123, Calendar.JANUARY, i);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);


            if (calendar.get(Calendar.DAY_OF_WEEK) != 1){
                if (work == 0){
                    System.out.println(date);
                    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
                }


                if (work < 3){
                    work++;
                    if (work == 3){
                        work = 0;
                    }
                }


            }



        }


    }
}
