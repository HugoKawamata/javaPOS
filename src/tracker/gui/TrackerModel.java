package tracker.gui;

import java.io.IOException;
import tracker.*;

/**
 * Created by hugokawamata on 10/07/2016.
 */
public class TrackerModel {

    Orderlog log;

    public TrackerModel(){
        try{
            log = LogReader.read("log.txt");
        }
        catch(IOException error){

        }
    }
}
