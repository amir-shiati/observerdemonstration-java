package client;

import core.Date;
import core.DayMothYear;
import core.MonthDayYear;
import core.YearMonthDay;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.addObserver(new YearMonthDay());
        date.addObserver(new DayMothYear());
        date.addObserver(new MonthDayYear());

        date.updateObservers(Calendar.getInstance());
    }
}
