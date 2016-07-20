package tracker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by hugokawamata on 20/07/2016.
 */
public class MoneyBoy {

    private ArrayList<Day> days;

    public MoneyBoy(){
        days = new ArrayList<>();
    }

    public MoneyBoy(MoneyBoy prev){
        days = prev.getSpreadsheet();
    }

    public ArrayList<Day> getSpreadsheet(){
        return new ArrayList<>(days);
    }

}
