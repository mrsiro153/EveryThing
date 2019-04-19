package recentBill;

import com.google.gson.Gson;
import designPattern.behavioral.command.OrderDish;

import java.util.Calendar;
import java.util.Date;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 13/03/2019
 * Time: 9:21 AM
 */
public class MainClass {
    private Calendar calendar;;

    public static void main(String[] args) {
        Date date = new Date();
        int day = 14;
        Date afterCal = new MainClass().CalDate(date,0,day);
        System.out.println(afterCal);
    }
    public Date CalDate(Date date, Integer month, Integer day) {
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, day);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }
}
