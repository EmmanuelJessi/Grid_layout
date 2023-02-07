package Home;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Grid_panels {
    JFrame Grid_panels_Frame;
    JPanel panelOne, panelTwo;
    JLabel EmailJLabel;
    JPanel panelOne, panelTwo, panelThree, panelFour;

    public Grid_panels() {
        this.prepare_Grid_panels_layout();
    }

    public final void prepare_Grid_panels_layout() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        Grid_panels_Frame = new JFrame("Grid panels Frame");
        Grid_panels_Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Grid_panels_Frame.setLayout(new GridLayout(1, 2));
        Grid_panels_Frame.add(this.prepare_panelOne());
        Grid_panels_Frame.setVisible(true);

    }

    public final JPanel prepare_panelOne() {
        panelOne = new JPanel();
        Border panelOneBorder = BorderFactory.createTitledBorder("panel One");

        panelOne.setLayout(null);

        panelOne.setBorder(panelOneBorder);
        return panelOne;
    }
    public final JPanel prepare_panelTwo(){
        panelTwo = new JPanel();
        Border panelTwoBorder = BorderFactory.createTitledBorder("panel Two");
        panelTwo.setBorder(panelTwoBorder);
        return panelTwo;

    }
    public final JPanel prepare_panelThree(){
        panelThree = new JPanel();
        Border panelThreeBorder = BorderFactory.createTitledBorder("panel Three");
        panelThree.setBorder(panelThreeBorder);
        return panelThree;
    }
    public final JPanel prepare_panelFour(){
        Border panelFourBorder = BorderFactory.createTitledBorder("panel Four");
        panelFour.setBorder(panelFourBorder);
        return panelFour;
    }
}


