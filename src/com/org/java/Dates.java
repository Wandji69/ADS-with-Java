package com.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2020, 2, 28);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        String sd = df.format(d2);
        System.out.println(sd);

    }
}
