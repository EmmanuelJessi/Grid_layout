package Home;

import javax.swing.*;
import java.awt.*;

public class Border_layout {
    public Border_layout() {
        JFrame Border_JFrame = new JFrame("Border layout Frame");

        JButton ButtonOne = new JButton("Button one");
        JButton ButtonTwo = new JButton("Button Two");
        JButton ButtonThree = new JButton("Button Three");
        JButton ButtonFour = new JButton("Button Four");
        JButton ButtonFive = new JButton("Button");

        Border_JFrame.add(ButtonOne, BorderLayout.NORTH);
        Border_JFrame.add(ButtonTwo, BorderLayout.SOUTH);
        Border_JFrame.add(ButtonThree, BorderLayout.WEST);
        Border_JFrame.add(ButtonFour, BorderLayout.EAST);
        Border_JFrame.add(ButtonFive, BorderLayout.CENTER);

        Border_JFrame.setSize(500, 500);
        Border_JFrame.setVisible(true);
    }
}
