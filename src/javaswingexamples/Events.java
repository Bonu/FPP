package javaswingexamples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Events extends JFrame{
	
	private JLabel label;
	private JButton button;
	private JLabel label1;
	private JButton button1;
	
	public Events()
	{
		setLayout(new FlowLayout());
		button = new JButton("Click to Get Text");
		add(button);
		label = new JLabel("");
		add(label);
		button1 = new JButton("Click to Clear Text");
		add(button1);
		// User defined class to handle events
		event e = new event();
		button.addActionListener(e);
		event1 e1 = new event1();
		button1.addActionListener(e1);
	}
	//Inner Class
	 class event implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Now you can see the text of Label");
			
		}
	}

	class event1 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e1) {
			label.setText(" ");
			getContentPane().setBackground(Color.PINK);
	
		}
	}
	public static void main(String[] args) {
		Events Gui = new Events();
		Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gui.setTitle("First Event Frame");
		Gui.setSize(300,100);
		Gui.setVisible(true);
	}
}
