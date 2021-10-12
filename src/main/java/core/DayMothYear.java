package core;

import java.util.Calendar;

// DD/MM/YYYY
public class DayMothYear implements DateObserver {
    @Override
    public void update(Calendar date) {
        System.out.println("DD/MM/YYYY : " + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR));
    }
}
