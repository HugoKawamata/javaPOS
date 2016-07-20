package tracker;

import java.io.IOException;
import java.util.*;

/**
 * Created by hugokawamata on 10/07/2016.
 */
public class Orderlog {

    private HashMap<Food, Integer> log;


    public Orderlog(){
        log = new HashMap<>();
    }

    public void addOrder(Food item){
        Integer currentNum = 0;

        if(log.containsKey(item)){
            currentNum = log.get(item);
        }

        log.put(item, currentNum+1);
    }

    public void addOrder(Food item, Integer num){
        log.put(item, num);
    }

    public String toString(){
        String result = "";
        for(Map.Entry<Food, Integer> entry : log.entrySet()){
            result = result + entry.getKey().toString() + " " +
                    entry.getValue().toString() + System.getProperty("line.separator");
        }
        return result;
    }

    public int hashCode(){
        return log.hashCode();
    }

}
