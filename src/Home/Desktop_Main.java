package Home;

import javax.swing.*;

public class Desktop_Main {

    public static void main(String[] args) {
//          new Cards_With_Panels();
//        new Border_layout();
//        new Grid_layout();
//        new Grid_panels();
//        new Card_Layout();
//        new Building_Menus();
//        new panel_buttons();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });

    }
}