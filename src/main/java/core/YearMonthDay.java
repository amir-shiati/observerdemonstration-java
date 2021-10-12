package core;

import java.util.Calendar;

// YYYY/MM/DD
// The best type of date format! :)
public class YearMonthDay implements DateObserver {
    @Override
    public void update(Calendar date) {
        System.out.println("YYYY/MM/DD : " + date.get(Calendar.YEAR) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.DAY_OF_MONTH));
    }
}
