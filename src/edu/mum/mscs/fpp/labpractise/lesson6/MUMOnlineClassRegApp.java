package edu.mum.mscs.fpp.labpractise.lesson6;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MUMOnlineClassRegApp {

	JFrame appFrame = new JFrame("MUM Online Class Registration System");
	public MUMOnlineClassRegApp() {
	
		appFrame.setSize(600,700);
		Container container = appFrame.getContentPane();
		
		container.setBackground(Color.GRAY);
		appFrame.setResizable(true);
		
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setComponent(container);
		appFrame.repaint();
		appFrame.setVisible(true);
		
	}
	
	public void setComponent(Container container){
		
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("Java");
		jcb.addItem("Algorithms");
		jcb.addItem("Artifical Intelligence");
		
		JCheckBox c1 = new JCheckBox("Morning");
		JCheckBox c2 = new JCheckBox("Afternoon");
		JCheckBox c3 = new JCheckBox("Evening");
		
		ButtonGroup cbg = new ButtonGroup();
		cbg.add(c1);
		cbg.add(c2);
		cbg.add(c3);
		
		JPanel cpanel = new JPanel();
		cpanel.setLayout(new GridLayout(1,3));
		cpanel.add(c1);
		cpanel.add(c2);
		cpanel.add(c3);
		
		JPanel rpanel = new JPanel();
		rpanel.setLayout(new GridLayout(1,2));
		rpanel.add(male);
		rpanel.add(female);
		
		ButtonGroup rbg = new ButtonGroup();
		rbg.add(male);
		rbg.add(female);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(12,2));
		panel.add(new Label(" "));
		panel.add(new Label("Welcome to MUM \n Online Class Registration Form"));
		panel.add(new Label("First Name"));
		panel.add(new TextField());
		panel.add(new Label("Last Name"));
		panel.add(new TextField());
		panel.add(new Label("Street"));
		panel.add(new TextField());
		panel.add(new Label("City"));
		panel.add(new TextField());
		panel.add(new Label("State"));
		panel.add(new TextField());
		panel.add(new Label("Country"));
		panel.add(new TextField());
		panel.add(new Label("Gender"));
		panel.add(rpanel);
		panel.add(new Label("Select Course"));
		panel.add(jcb);
		panel.add(new Label("Suitable Session:"));
		panel.add(cpanel);
		panel.add(new Label("Message"));
		panel.add(new TextArea());
		
		container.add(panel);
	}
	
	public static void main(String args[]){
		MUMOnlineClassRegApp app = new MUMOnlineClassRegApp();
	}

}
