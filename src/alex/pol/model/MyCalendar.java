package alex.pol.model;

import java.util.GregorianCalendar;

public class MyCalendar extends GregorianCalendar {
    public MyCalendar(int year, int month) {
        super(year, month-1, 1);
    }
}
