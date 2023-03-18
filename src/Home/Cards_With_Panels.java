package Home;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
class Cards_With_Panels {
    JFrame Card_Panels_Frame;
    JPanel PanelOne, PanelTwo, PanelThree, PanelFour;
    JButton ButtonOne, ButtonTwo;


    public Cards_With_Panels() {
        this.prepare_Card_Panel_Layout();
    }
    public void prepare_Card_Panel_Layout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame card_Panel_Frame = new JFrame("grid panel frame");
        card_Panel_Frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        card_Panel_Frame.setLayout(new GridLayout(2,2));

        card_Panel_Frame.add(this.prepare_panelOne(),BorderLayout.NORTH);
        card_Panel_Frame.add(this.Prepare_PanelTwo(),BorderLayout.SOUTH);
        card_Panel_Frame.add(this.Prepare_PanelThree());
        card_Panel_Frame.add(this.Prepare_PanelFour());

        card_Panel_Frame.setVisible(true);
    }
    public final JPanel prepare_panelOne(){
        PanelOne= new JPanel();
        Border PanelOneBorder= BorderFactory.createTitledBorder("PanelOne");
        this.prepare_ButtonTwo().setBounds(20, 20, 250, 40);
        PanelOne.setBorder(PanelOneBorder);
        PanelOne.setFont(new Font("calibri", Font.PLAIN, 30));


//        PanelOne.add(this.Prepare_PanelTwo());
//        PanelOne.add(this.Prepare_PanelThree());
        return PanelOne;
    }

    public final JPanel Prepare_PanelTwo(){
        PanelTwo= new JPanel();
        Border PanelTwoBorder= BorderFactory.createTitledBorder("Panel Two");
        this.prepare_ButtonOne().setBounds(20, 20, 250, 40);
        PanelTwo.setBorder(PanelTwoBorder);
        ButtonTwo.setFont(new Font("calibri", Font.PLAIN, 30));
        PanelTwo.setLayout(null);
        PanelTwo.add(ButtonTwo);
        return PanelTwo;
    }
    public final JPanel Prepare_PanelThree(){
        PanelThree= new JPanel();
        Border PanelThreeBorder= BorderFactory.createTitledBorder("PanelThree");
        PanelThree.setBorder(PanelThreeBorder);
        return PanelThree;
    }
    public final JPanel Prepare_PanelFour(){
        PanelFour= new JPanel();
        Border PanelFourBorder= BorderFactory.createTitledBorder("PanelFour");
        this.prepare_ButtonOne().setBounds(20, 20, 250, 40);
        ButtonTwo.setFont(new Font("calibri", Font.PLAIN, 30));
        PanelFour.setBorder(PanelFourBorder);

        PanelFour.add(this.prepare_ButtonOne());
        PanelFour.add(this.prepare_ButtonTwo());
        return PanelFour;
    }
    public final JButton prepare_ButtonOne(){
        ButtonOne = new JButton("Show Panel 2");
        return ButtonOne;
    }
    public final JButton prepare_ButtonTwo(){
        ButtonTwo = new JButton("Show Panel 1");
        return ButtonTwo;
    }

}

