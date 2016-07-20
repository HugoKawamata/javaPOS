package tracker.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by hugokawamata on 10/07/2016.
 */
public class TrackerView extends JFrame {

    private TrackerModel model;

    public TrackerView(TrackerModel model){
        this.model = model;
        setTitle("Ordertrackertron 2000");
        setBounds(400,100,600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());

    }

    private void addButtons(Container container){
        GridBagConstraints buttonGBC = new GridBagConstraints();
        buttonGBC.weightx = 0.5;
        buttonGBC.ipadx = 5;
        buttonGBC.fill = GridBagConstraints.HORIZONTAL;

    }
}
