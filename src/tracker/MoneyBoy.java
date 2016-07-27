package tracker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by hugokawamata on 20/07/2016.
 */
public class MoneyBoy {

    private ArrayList<Week> weeks;

    public MoneyBoy(){
        weeks = new ArrayList<>();
    }

    public MoneyBoy(MoneyBoy existing){
        weeks = existing.getSpreadsheet();
    }


    public ArrayList<Week> getSpreadsheet(){
        return new ArrayList<>(weeks);
    }

    public String toString(){
        String result = "";
        for (Week week : weeks){
            result += week.toString();
        }
        return result;
    }



}
