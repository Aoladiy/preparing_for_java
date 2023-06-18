import java.time.LocalDate;

public class Task_9_day_of_nedela {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2023-05-25");
        System.out.println(date.getDayOfWeek());
    }
}
