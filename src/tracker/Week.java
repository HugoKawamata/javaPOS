package tracker;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hugokawamata on 20/07/2016.
 */
public class Week {

    private ArrayList<Day> days;
    private String mondayDate;
    private Double weeklyProfit;

    public Week(){
        days = new ArrayList<>();
        weeklyProfit = 0.0;
    }


    /**
     * Adds a new (complete) day to an incomplete week.
     * @param incompleteWeek incomplete week
     * @param newDay fully complete day
     */
    public Week(Week incompleteWeek, Day newDay){
        // If the week given is incomplete, add the new day, else just make
        // a clone of the week.
        if (incompleteWeek.getDays().size() < 7) {
            days = incompleteWeek.getDays();
            days.add(newDay);
        } else {
            days = incompleteWeek.getDays();
        }

        // Add each profit from each day
        for (Day day : getDays()){
            weeklyProfit += day.getProfit();
            if (day.getDay().equals("Monday")){
                mondayDate = day.getDate();
            }
        }
    }


    public ArrayList<Day> getDays(){
        return new ArrayList<>(days);
    }

    public String toString(){
        String result = "";
        // Add all the days up into a string
        for (Day day : getDays()){
            result += day.toString();
        }
        // Add a new line with the weekly profit
        if (days.size() == 7){
            result += weeklyProfit + System.getProperty("line.separator");
        }
        return result;
    }
}
