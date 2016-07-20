package tracker;

import java.util.ArrayList;

/**
 * Created by hugokawamata on 20/07/2016.
 */
public class Order {
    ArrayList<Food> orderlist;

    public Order(){
        orderlist = new ArrayList<>();
    }

    public void addItem(Food item){
        orderlist.add(item);
    }
}
