package Home;

import javax.swing.*;
import java.awt.*;

public class Grid_layout {
    JFrame GridFrame;
    JButton buttonOne, buttonTwo, buttonThree, buttonFour;
    public Grid_layout(){
        this.Prepare_Frame_layout();
    }
    public final void Prepare_Frame_layout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        GridFrame = new JFrame("Grid layout Frame");
        GridFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        GridFrame.setLayout(new GridLayout(2, 2));
        GridFrame.add(this.Prepare_buttonOne());
        GridFrame.add(this.Prepare_buttonTwo());
        GridFrame.add(this.Prepare_buttonThree());
        GridFrame.add(this.Prepare_buttonFour());
        GridFrame.setVisible(true);
    }

    public final JButton Prepare_buttonOne(){
        buttonOne = new JButton("buttonOne");
        return buttonOne;
    }
    public final JButton Prepare_buttonTwo(){
        buttonTwo = new JButton("buttonTwo");
        return buttonTwo;
    }
    public final JButton Prepare_buttonThree(){
         buttonThree = new JButton("buttonThree");
         return buttonThree;
    }
    public final JButton Prepare_buttonFour(){
         buttonFour = new JButton("buttonFour");
         return buttonFour;
    }
}
