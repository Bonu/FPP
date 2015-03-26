package javaswingexamples;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonSetDifferent {
	public static void main(String[] args)
	{
		// Demo for null layout
		JFrame frame = new JFrame("Laying Out Components Using Absolute Coordinates");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JPanel panel = new JPanel();
		  panel.setLayout(null);
		  JLabel label1 = new JLabel("Java Swing");
		  JTextField field = new JTextField(20);
		  JButton button1 = new JButton("OK");
		  JButton button2 = new JButton("Cancel");
		  label1.setBounds(0, 0, 100, 50);
		  field.setBounds(75, 100, 200, 25);
		  button1.setBounds(40, 200, 75, 25);
		  button2.setBounds(200, 200, 75, 25);
		  panel.add(label1);
		  panel.add(field);
		  panel.add(button1);
		  panel.add(button2);
		  frame.add(panel);
		  frame.setSize(400,400);
		  frame.setVisible(true);
	}
}