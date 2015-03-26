package javaswingexamples;
import javax.swing.*;

public class SwingFrame 
{
	public static void main(String[] args) 
	{
	JFrame frame = new JFrame();
	frame.setTitle("Hello World");
	frame.setSize(300,200);
	//frame.setResizable(false);
	frame.setVisible(true);
	frame.setLocation(100, 100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	}
}



