package alex.pol.model;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Alex on 20.10.2015.
 */
public class Period {
    private Date dateStart;
    private Date dateEnd;
    private static SimpleDateFormat sdf = new SimpleDateFormat("MM/YYYY");


    public Period(MyCalendar dateStart, MyCalendar dateEnd) {

        this.dateStart = dateStart.getTime();
       this.dateEnd = dateEnd.getTime();
    }



    @Override
    public String toString() {
        String start = sdf.format(dateStart);
        String end = sdf.format(dateEnd);


        return start + " - " + end;
    }

    public static void main(String[] args) {
          Period period = new Period(new MyCalendar(2011,9),new MyCalendar(2012,10) );
        System.out.println(period);
    }
}
