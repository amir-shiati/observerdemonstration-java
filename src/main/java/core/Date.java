package core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Date {
    private List<DateObserver> observers;

    public Date() {
        this.observers = new ArrayList<DateObserver>();
    }

    public void addObserver(DateObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DateObserver observer) {
        observers.remove(observer);
    }

    public void updateObservers(Calendar date) {
        for (DateObserver observer : observers)
            observer.update(date);
    }
}
