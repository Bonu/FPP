package javaswingexamples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch6JMenuFrame extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JLabel   response;
    private JMenu    fileMenu;
    private JMenu    editMenu;

    public static void main(String[] args) {
        Ch6JMenuFrame frame = new Ch6JMenuFrame();
        frame.setVisible(true);
    }

    public Ch6JMenuFrame() {
        Container contentPane;

        //set the frame properties
        setTitle     ("Ch6JMenuFrame: Testing Swing Menus");
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);


        contentPane = getContentPane( );
        contentPane.setLayout(null);
        contentPane.setBackground( Color.white );

        //create two menus and their menu items
        createFileMenu();
        createEditMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester." );
        response.setBounds(50, 50, 250, 50);
        contentPane.add(response);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    public void actionPerformed(ActionEvent event) {
        String  menuName;
        menuName = event.getActionCommand();

        if (menuName.equals("Quit")) {
           System.exit(0);

        } else {
           response.setText("Menu Item '" + menuName + "' is selected.");
        }
    }
    private void createFileMenu( ) {
        JMenuItem    item;

        fileMenu = new JMenu("File");

        item = new JMenuItem("New");        //New
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Open");    //Open...
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Save");       //Save
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Save As"); //Save As...
        item.addActionListener( this );
        fileMenu.add( item );

        fileMenu.addSeparator();           //add a horizontal separator line

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( this );
        fileMenu.add( item );
    }

     private void createEditMenu( ) {
        JMenuItem    item;

        editMenu = new JMenu("Edit");

        item = new JMenuItem("Cut");      //Cut
        item.addActionListener( this );
        editMenu.add( item );

        item = new JMenuItem("Copy");    //Copy
        item.addActionListener( this );
        editMenu.add( item );

        item = new JMenuItem("Paste");    //Paste
        item.addActionListener( this );
        editMenu.add( item );
    }

}