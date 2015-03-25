package edu.mum.mscs.fpp.labpractise.lesson6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BorderLayoutTest {
	
	JFrame myFrame = new JFrame("BorderLayout Test");
	
	public BorderLayoutTest(){
//		JFrame myFrame = new JFrame("BorderLayout Test");
		myFrame.setSize(300, 300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JButton yellow = new JButton("Yellow");
		JButton blue = new JButton("Blue");
		JButton green = new JButton("Green");
		panel.add(yellow);
		event e1 = new event();
		event2 e2 = new event2();
		event3 e3 = new event3();
		yellow.addActionListener(e1);
		blue.addActionListener(e2);
		green.addActionListener(e3);
		panel.add(blue);
		panel.add(green);
		myFrame.add(panel, BorderLayout.SOUTH);
		myFrame.setVisible(true);
	}
	
	public static void main(String[] a) {
		BorderLayoutTest blt = new BorderLayoutTest();
	}

	// Define action listener for Yellow button
	class event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e1) {
			System.out.println("Action performed: yellow");
			myFrame.getContentPane().setBackground(Color.YELLOW);
			myFrame.repaint();
		}
	}
	
	class event2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e2) {
			System.out.println("Action performed: Blue");
			myFrame.getContentPane().setBackground(Color.BLUE);
			myFrame.repaint();
		}
	}
	
	class event3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			System.out.println("Action performed: Green");
			myFrame.getContentPane().setBackground(Color.GREEN);
			myFrame.repaint();
		}
	}
}
