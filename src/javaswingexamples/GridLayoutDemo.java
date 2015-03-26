package javaswingexamples;

import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutDemo {
	           // Demo for Grid Layout

		public GridLayoutDemo() {
	        
	        JFrame frame = new JFrame();
	        frame.setSize(300,300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setTitle("JFrame Test");
	        frame.setLayout(new GridLayout(3, 2));
	        frame.add(new JLabel("First Name:"));
	        frame.add(new JTextField());
	        frame.add(new JLabel("Last Name:"));
	        frame.add(new JTextField());
	        frame.add(new JButton("Register"));
	      	     
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    }

	    public static void main(String[] args) {
	    	GridLayoutDemo test = new GridLayoutDemo();
	    	
	    }
	}
