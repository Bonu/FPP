package javaswingexamples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ch6TextFrame3 extends JFrame implements ActionListener {

	    private static final int FRAME_WIDTH    = 300;
	    private static final int FRAME_HEIGHT   = 250;
	    private static final int FRAME_X_ORIGIN = 150;
	    private static final int FRAME_Y_ORIGIN = 250;
	    private static final int BUTTON_WIDTH  = 80;
	    private static final int BUTTON_HEIGHT = 30;
	    private static final String EMPTY_STRING = "";
	    private static final String NEWLINE = System.getProperty("line.separator");
	    private JButton clearButton;
	    private JButton addButton;
	    private JTextField inputLine;
	    private JTextArea  textArea;


	    public static void main(String[] args) {
	        Ch6TextFrame3 frame = new Ch6TextFrame3();
	        frame.setVisible(true);
	    }


	    public Ch6TextFrame3() {
	        Container contentPane;

	        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
	        setResizable (false);
	        setTitle     ("Program Ch6TextFrame3");
	        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

	        contentPane = getContentPane( );
	        contentPane.setLayout( null );
	        contentPane.setBackground( Color.white );

	   
	        addButton = new JButton("ADD");
	        addButton.setBounds(70, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
	        contentPane.add(addButton);

	        clearButton = new JButton("CLEAR");
	        clearButton.setBounds(160, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
	        contentPane.add(clearButton);

	  
	        clearButton.addActionListener(this);
	        addButton.addActionListener(this);

	        inputLine = new JTextField();
	        inputLine.setBounds(90, 155, 130, 25);
	        contentPane.add(inputLine);

	        inputLine.addActionListener(this);

	        textArea = new JTextArea();
	        textArea.setBounds(50, 5, 200, 135);
	        textArea.setBorder(BorderFactory.createLineBorder(Color.red));

	//---------------------------------------
	//  Different types of borders; some borders effective if background color is changed
	
	        textArea.setBorder(BorderFactory.createEtchedBorder(Color.blue, Color.gray));
	
	       // textArea.setBorder(BorderFactory.createLoweredBevelBorder());
	        textArea.setBorder(BorderFactory.createRaisedBevelBorder());
	        textArea.setBorder(BorderFactory.createTitledBorder("JTextArea"));

	//-------------------------------------

	        textArea.setEditable(false);
	        contentPane.add(textArea);

	//----------------------------------------------------
//	      To add scroll bars to the text area

	       
	        JScrollPane scrollText= new JScrollPane(textArea);
	        scrollText.setBounds(50, 5, 200, 135);
	        scrollText.setBorder(BorderFactory.createLineBorder(Color.red));
	        contentPane.add(scrollText);

	//------------------------------------------------------

	         setDefaultCloseOperation( EXIT_ON_CLOSE );
	    }


	    public void actionPerformed(ActionEvent event) {

	        if (event.getSource() instanceof JButton) 
	        {
	            JButton clickedButton = (JButton) event.getSource();
	            event.getActionCommand();
	            if (clickedButton == addButton) 
	            {//Same Addresses.Same object
	                addText(inputLine.getText());
	            } else {
	                clearText( );
	            }

	        } else { //the event source is inputLine
	            addText(inputLine.getText());
	        }
	    }

	    private void addText(String newText) {
	        textArea.append(newText + NEWLINE);
	        inputLine.setText("");
	    }

	    private void clearText( ) {
	        textArea.setText(EMPTY_STRING);
	        inputLine.setText(EMPTY_STRING);
	    }

	}
		

	


