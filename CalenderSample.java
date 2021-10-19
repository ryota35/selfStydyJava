import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class CalenderSample {
  public static void main(String[] args) {

    String[] week = { "", "日", "月", "火", "水", "木", "金", "土" };

    Calendar cal = Calendar.getInstance();

    cal.set(2021, 9, 19);

    int i = cal.get(Calendar.DAY_OF_WEEK);

    System.out.println(week[i]);

    LocalDate ld = LocalDate.of(2021, 10, 19);
    System.out.println(DayOfWeek.TUESDAY == ld.getDayOfWeek());

  }
}