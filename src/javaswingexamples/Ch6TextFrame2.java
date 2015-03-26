package javaswingexamples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ch6TextFrame2 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton cancelButton;
    private JButton okButton;
    private JTextField inputLine;
    private JLabel prompt;
    private JLabel image;

    public static void main(String[] args) {
        Ch6TextFrame2 frame = new Ch6TextFrame2();
        frame.setVisible(true);
    }

    public Ch6TextFrame2()
    {

        Container contentPane = getContentPane( );

        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable ( false );
        setTitle     ( "Event Handling Demo" );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );

 
        contentPane.setLayout( null );
        contentPane.setBackground( Color.white );

  
        okButton = new JButton("OK");
        okButton.setBounds(70, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(160, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

   
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
	    inputLine = new JTextField();
        inputLine.setBounds(90, 50, 130, 25);
        contentPane.add(inputLine);
        inputLine.addActionListener(this);
        prompt = new JLabel( );
        prompt.setText("Please enter your name");
        //  prompt = new JLabel( "Please enter your name");
        prompt.setBounds(85, 20, 150, 25);
        contentPane.add( prompt );
         setDefaultCloseOperation( EXIT_ON_CLOSE );
   }

   public void actionPerformed(ActionEvent event) {
        if (event.getSource() instanceof JButton) {
             JButton clickedButton = (JButton) event.getSource();
             String  buttonText = clickedButton.getText();
             setTitle(inputLine.getText()+" Clicked " + buttonText);
             Container contentPane = getContentPane( );
             contentPane.setBackground(Color.BLUE);
                          
        } else { 
             setTitle("You entered '" + inputLine.getText() + "'");
        }
   }
}



	
	


