import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE"); //паттерны можно смотреть на сайте oracle
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("d");
        String dayOfMonth = dayOfMonthFormat.format(currentDate);

        SimpleDateFormat monthInYearFormat = new SimpleDateFormat("MMMM");
        String monthInYear = monthInYearFormat.format(currentDate);

        System.out.println("Today is " + dayOfMonth + " of " + monthInYear + ", " + dayOfWeek);
    }
}
