/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author janardhanbonu
 *
 */
public class DefaultLayoutUI_1 {

	JFrame frame = new JFrame("Default Panel Alignment Demo");
	
	JTextField  t1 = new JTextField(20);
	JTextField  t2 = new JTextField(20);
	JTextField  t3 = new JTextField(20);
	JTextField  t4 = new JTextField(20);
	JTextField  t5 = new JTextField(20);

	
	/**
	 * 
	 */
	public DefaultLayoutUI_1() {
		
		Container container = frame.getContentPane();
		JPanel panel = new JPanel();
		
		JLabel l1 = new JLabel("Name");
		JLabel l2 = new JLabel("Street");
		JLabel l3 = new JLabel("City");
		JLabel l4 = new JLabel("State");
		JLabel l5 = new JLabel("Zip");
		
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(t2);
		panel.add(l3);
		panel.add(t3);
		panel.add(l4);
		panel.add(t4);
		panel.add(l5);
		panel.add(t5);
		
		JButton but = new JButton("Submit");
		
		but.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.printf("%s \n %s \n %s, %s %s",t1.getText(),
						t2.getText(),t3.getText(),t4.getText(),t5.getText());
			}
			
		});
		
		panel.add(but);
		
		frame.setSize(900, 400);
		container.add(panel);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	    Container contentPane = frame.getContentPane();
	    contentPane.setBackground(Color.gray);
	    frame.setVisible(true);
	
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DefaultLayoutUI_1();
	}

}
