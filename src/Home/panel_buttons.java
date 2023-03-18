package Home;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class panel_buttons {
    JFrame panel_button;
    JPanel panelOne, panelTwo, panelThree;
    JButton buttonOne, buttonTwo;

    public panel_buttons() {
        this.prepare_Grid_panels_layout();
    }

    public final void prepare_Grid_panels_layout() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        panel_button = new JFrame("Grid Layout Frame");
        panel_button.setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel_button.setLayout(new GridLayout(2, 2));
        panel_button.add(this.prepare_panelOne());
        panel_button.add(this.prepare_panelTwo());
        panel_button.add(this.prepare_panelThree());
        panel_button.setVisible(true);

    }



    public final JPanel prepare_panelOne() {
        panelOne = new JPanel();
        Border panelOneBorder = BorderFactory.createTitledBorder("panel one");
        buttonOne = new JButton("Button One");
        buttonOne.setBounds(20, 20, 250, 40);
        panelOne.setBorder(panelOneBorder);
        buttonOne.setFont(new Font("calibri", Font.PLAIN, 30));
        panelOne.setLayout(null);
        panelOne.add(buttonOne);
        return panelOne;


    }

    public final JPanel prepare_panelTwo() {
        panelTwo = new JPanel();

        Border panelTwoBorder = BorderFactory.createTitledBorder("panel two");
        buttonTwo = new JButton("Button One");
        buttonTwo.setBounds(20, 20, 250, 40);
        panelTwo.setBorder(panelTwoBorder);
        buttonTwo.setFont(new Font("calibri", Font.PLAIN, 30));
        panelTwo.setLayout(null);
        panelTwo.add(buttonTwo);
        panelTwo.add(buttonTwo);
        panelTwo.setBorder(panelTwoBorder);

        return panelTwo;
    }

    public final JPanel prepare_panelThree() {
        panelThree = new JPanel();
        Border panelThreeBorder = BorderFactory.createTitledBorder("panel three");
        panelThree.setBorder(panelThreeBorder);
        return panelThree;
    }


}

