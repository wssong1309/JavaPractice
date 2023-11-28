package ch08.practice03;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
        String[] noonName = {"오전", "오후"};
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);

        String week = weekName[c.get(Calendar.DAY_OF_WEEK)];
        String noon;
        if (c.get(Calendar.HOUR_OF_DAY) < 12) {
            noon = noonName[0];
        } else {
            noon = noonName[1];
        }

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(week + "요일 " + noon);
        System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
    }
}
