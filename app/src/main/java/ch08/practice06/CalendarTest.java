package ch08.practice06;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        String[] noonName = { "오전", "오후" };
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DAY_OF_MONTH);

        String noon;
        if (c.get(Calendar.HOUR_OF_DAY) < 12) {
            noon = noonName[0];
        } else {
            noon = noonName[1];
        }

        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.printf("%04d.%02d.%02d %s %02d:%02d:%02d\n", year, month, date, noon, hour, minute, second);
        System.out.printf("오늘은 %d월의 %d번째 날\n", month, date);
        System.out.printf("오늘은 %d년의 %d번째 날", year, c.get(Calendar.DAY_OF_YEAR));
    }
}
