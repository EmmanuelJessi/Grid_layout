package Home;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Simple Swing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridLayout(1, 2));

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu webScriptingMenu = new JMenu("Web Scripting");
        webScriptingMenu.add(new JMenuItem("HTML"));
        webScriptingMenu.add(new JMenuItem("CSS"));
        webScriptingMenu.add(new JMenuItem("Javascript"));
        webScriptingMenu.add(new JMenuItem("JQuery"));


        JMenu backEndMenu = new JMenu("Back-end");
        backEndMenu.add(new JMenuItem("R Language"));
        backEndMenu.add(new JMenuItem("Python"));
        backEndMenu.add(new JMenuItem("C#"));
        backEndMenu.add(new JMenuItem("GO"));


        JMenu databaseMenu = new JMenu("Database");


        JMenu unitTestingMenu = new JMenu("Unit Testing");
        unitTestingMenu.add(new JMenuItem("J-unit"));
        unitTestingMenu.add(new JMenuItem("Mocha"));
        unitTestingMenu.add(new JMenuItem("Espresso"));
        unitTestingMenu.add(new JMenuItem("Selenium"));
        unitTestingMenu.add(new JMenuItem("M-unit"));


        menuBar.add(webScriptingMenu);
        menuBar.add(backEndMenu);
        menuBar.add(databaseMenu);
        menuBar.add(unitTestingMenu);
        setJMenuBar(menuBar);

        // Grid One
        JPanel gridOne = new JPanel(new BorderLayout());
        gridOne.setBorder(BorderFactory.createTitledBorder("Back-end Programming"));
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        gridOne.add(scrollPane, BorderLayout.CENTER);

        // Grid Two
        JPanel gridTwo = new JPanel(new BorderLayout());
        gridTwo.setBorder(BorderFactory.createTitledBorder("Data-Management"));
        JTextField textField = new JTextField();
        gridTwo.add(textField, BorderLayout.CENTER);

        add(gridOne);
        add(gridTwo);
    }

}

