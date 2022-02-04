package ch10;

import java.util.Calendar;

public class CalenderEx1 {
    public static void main(String[] args) {
        //Calender 는 다른 녀석들과 다른 방식으로 불러와야한다
        Calendar today = Calendar.getInstance(); //기본적으로 현재 날짜와 시간으로 설정된다.
        System.out.println("이 해의 년도 >>"+today.get(Calendar.YEAR));
        System.out.println("Month >>"+today.get(Calendar.MONTH));
        System.out.println("week of year >> "+today.get(Calendar.WEEK_OF_YEAR));

        System.out.println("Day of year >> "+ today.get(Calendar.DAY_OF_YEAR));
        System.out.println("HOUR of day >> "+today.get(Calendar.HOUR_OF_DAY));

        System.out.println("Hour>" +today.get(Calendar.HOUR));
        System.out.println("MIN > "+today.get(Calendar.MINUTE));
        System.out.println("sec > "+today.get(Calendar.SECOND));
    }
}
