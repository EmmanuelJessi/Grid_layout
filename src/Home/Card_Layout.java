package Home;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card_Layout {
    JFrame Card_Panels_Frame;
    JPanel PanelOne, PanelTwo,PanelThree,PanelFour;
    JButton ButtonOne,ButtonTwo;
    CardLayout Card_Layout;
    public Card_Layout(){
        this.Prepare_Card_Layout();
    }
    public final void Prepare_Card_Layout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        Card_Panels_Frame=new JFrame();
        Card_Panels_Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Card_Panels_Frame.add(this.Prepare_PanelOne(),BorderLayout.NORTH);
        Card_Panels_Frame.add(this.Prepare_PanelFour(),BorderLayout.SOUTH);
        Card_Panels_Frame.setVisible(true);
    }
    public final JPanel Prepare_PanelOne(){
        PanelOne = new JPanel();
        Border PanelOneBorder = BorderFactory.createTitledBorder("Panel One");
        PanelOne.setBorder(PanelOneBorder);

        Card_Layout = new CardLayout();
        PanelOne.setLayout(Card_Layout);
        PanelOne.add(this.Prepare_PanelTwo(),"Panel Two");
        PanelOne.add(this.Prepare_PanelThree(),"Panel Three");
        return PanelOne;
    }
    public final JPanel Prepare_PanelTwo(){
        PanelTwo = new JPanel();
        Border PanelTwoBorder = BorderFactory.createTitledBorder("Panel Two");
        PanelOne.setBorder(PanelTwoBorder);
        return PanelTwo;
    }
    public final JPanel Prepare_PanelThree(){
        PanelThree = new JPanel();
        Border PanelThreeBorder = BorderFactory.createTitledBorder("Panel Three");
        PanelThree.setBorder(PanelThreeBorder);
        return PanelThree;
    }
    public final JPanel Prepare_PanelFour(){
        PanelFour = new JPanel();
        Border PanelFourBorder = BorderFactory.createTitledBorder("Panel Four");
        PanelFour.setBorder(PanelFourBorder);

        PanelFour.add(this.Prepare_ButtonOne());
        PanelFour.add(this.Prepare_ButtonTwo());
        return PanelFour;
    }
    public final JButton Prepare_ButtonOne(){
        ButtonOne = new JButton("show Panel 2");
        ButtonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent  e) { Card_Layout.show(PanelOne,"Panel Two");
            }
        });
        return ButtonOne;
    }
    public final JButton Prepare_ButtonTwo(){
        ButtonTwo = new JButton("show Panel Three");
        ButtonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { Card_Layout.show(PanelOne,"Panel Three");

            }
        });
        return ButtonTwo;
    }
}



