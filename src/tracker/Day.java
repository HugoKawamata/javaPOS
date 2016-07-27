package tracker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hugokawamata on 20/07/2016.
 */
public class Day {

    private Double take;
    private Double hugo;
    private Double jess;
    private Double kate;
    private Double tim;
    private Double totalWages;
    private Double profit;
    private String date;
    private String day;

    // Converts the current calendar point into a day and date string
    public Day(){
        take = 0.0;
        Calendar c = Calendar.getInstance();
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        date = dateformat.format(c.getTime());
        day = "UNKNOWN";
        switch(c.get(Calendar.DAY_OF_WEEK)){
            case 1: day = "Sunday";
            case 2: day = "Monday";
            case 3: day = "Tuesday";
            case 4: day = "Wednesday";
            case 5: day = "Thursday";
            case 6: day = "Friday";
            case 7: day = "Saturday";
        }
    }

    public Day(Double take, Double hugo, Double jess, Double kate, Double tim, Double totalWages, Double profit, String date, String day){
        this.take = take;
        this.hugo = hugo;
        this.jess = jess;
        this.kate = kate;
        this.tim = tim;
        this.totalWages = totalWages;
        this.profit = profit;
        this.date = date;
        this.day = day;
    }

    public void setWages(Double hugo, Double jess, Double kate, Double tim){
        this.hugo = hugo;
        this.jess = jess;
        this.kate = kate;
        this.tim = tim;
        this.totalWages = hugo+jess+kate+tim;
        this.profit = take - totalWages;
    }

    public void addToTake(Double money){
        take += money;
    }

    public Double getProfit(){
        return profit;
    }

    public String getDay(){
        return day;
    }

    public String getDate(){
        return date;
    }

    public String toString(){
        return date + "," +
                day + "," +
                take.toString() + "," +
                hugo.toString() + "," +
                jess.toString() + "," +
                kate.toString() + "," +
                tim.toString() + "," +
                totalWages.toString() + "," +
                profit.toString() + "," +
                System.getProperty("line.separator");
    }
}
