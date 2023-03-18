package Home;

import javax.swing.*;

public class Building_Menus {
    JFrame Menu_Frame;
    JMenuBar Menu_Bar;
    JMenu Menu;

    JMenuItem MenuItemOne, MenuItemTwo, MenuItemThree, MenuItemFour;
    public Building_Menus() {
        this.Prepare_Menus_Layout();
    }
    public final void Prepare_Menus_Layout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        Menu_Frame= new JFrame("Card Panels Frame");
        Menu_Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Menu_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu_Frame.setJMenuBar(this.Prepare_JMenuBar());
        Menu_Frame.setVisible(true);
    }
    public final JMenuBar Prepare_JMenuBar(){
        Menu_Bar= new JMenuBar();
        Menu_Bar.add(this.Prepare_JMenu("Programming Languages", "Scala", "Java", "React", "C#"));
        return Menu_Bar;
    }
    public final JMenu Prepare_JMenu(String JMenu_Name, String ItemOne, String ItemTwo, String ItemThree, String ItemFour)
    {
        Menu= new JMenu(JMenu_Name);
        MenuItemOne= new JMenuItem(ItemOne);
        MenuItemTwo=new JMenuItem(ItemTwo);
        MenuItemThree=new JMenuItem(ItemThree);
        MenuItemFour=new JMenuItem(ItemFour);

        Menu.add(MenuItemOne);
        Menu.add(MenuItemTwo);
        Menu.add(MenuItemThree);
        Menu.add(MenuItemFour);

        return Menu;
    }
}

