package javaswingexamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuExample extends JFrame
{
    public JMenuExample()
    {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Veg Dish");
        menuBar.add(menu);

        JMenu submenu = new JMenu("Soup");
        menu.add(submenu);
        submenu.add(new JMenuItem("Tomato"));
        submenu.add(new JMenuItem("Corn"));
        

        submenu = new JMenu("Salad");
        menu.add(submenu);
        submenu.add(new JCheckBoxMenuItem("Fruit", true));
        submenu.add(new JCheckBoxMenuItem("Vegetable"));
        submenu.add(new JCheckBoxMenuItem("Dhal"));

        menu.addSeparator();
        
        submenu = new JMenu("Bread");
        menu.add(submenu);
        submenu.add(new JMenuItem("Wheat"));
        submenu.add(new JMenuItem("Ragi"));
                
        menu = new JMenu("Non-Veg");
        menuBar.add(menu);

        
        JRadioButtonMenuItem radioMenuItem;
        radioMenuItem = new JRadioButtonMenuItem("Gravy");
       
        menu.add(radioMenuItem);

        radioMenuItem = new JRadioButtonMenuItem("Chicken");
        radioMenuItem.setSelected(true);
        menu.add(radioMenuItem);

        radioMenuItem = new JRadioButtonMenuItem("Fish");
        menu.add(radioMenuItem);
    }

    public static void main(String [] args)
    {
        JMenuExample frame = new JMenuExample();
        frame.setTitle("Menu Example");
        frame.setSize(350, 175);
        frame.setVisible(true);
    }
}

