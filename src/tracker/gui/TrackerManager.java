package tracker.gui;

import tracker.*;

/**
 * Created by hugokawamata on 10/07/2016.
 */
public class TrackerManager {

    public static void main(String[] args) throws Exception{
        TrackerModel model = new TrackerModel();
        TrackerView view = new TrackerView(model);
        new TrackerController(model, view);
        view.setVisible(true);
    }
}
