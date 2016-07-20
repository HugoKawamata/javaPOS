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
    private Calendar c;
    private Date date;
    private int day;

    public Day(){
        take = 0.0;
        c = Calendar.getInstance();
        date = c.getTime();
        day = c.get(Calendar.DAY_OF_WEEK);
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
        switch(day){
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
        }
        return "UNKNOWN";
    }

    public String getDate(){
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        return dateformat.format(date);
    }

    public String toString(){
        return getDate() + "," +
                getDay() + "," +
                take.toString() + "," +
                hugo.toString() + "," +
                jess.toString() + "," +
                kate.toString() + "," +
                tim.toString() + "," +
                totalWages.toString() + "," +
                profit.toString() + ",";
    }
}
