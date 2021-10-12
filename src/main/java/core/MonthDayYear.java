package core;

import java.util.Calendar;
import java.util.Date;

// MM/DD/YYYY
public class MonthDayYear implements DateObserver {
    @Override
    public void update(Calendar date) {
        System.out.println("MM/DD/YYYY : " + date.get(Calendar.MONTH) + "/" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR));
    }
}
