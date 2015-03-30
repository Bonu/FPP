/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d3;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author janardhanbonu
 *
 */
public class ConversionUtilityUI {

	JFrame frame = new JFrame("Conversion Utility App");
	JTextField  mile = new JTextField(20);
	JTextField  kilometer = new JTextField(20);
	JTextField  pound = new JTextField(20);
	JTextField  kilogram = new JTextField(20);
	JTextField  gallon = new JTextField(20);
	JTextField  litre = new JTextField(20);
	JTextField  fahrenheit = new JTextField(20);
	JTextField  centigrade = new JTextField(20);
	
	/**
	 * 
	 */
	public ConversionUtilityUI() {
Container container = frame.getContentPane();
		
		
		JPanel panel = new JPanel(new GridLayout(5,4));
		
		JLabel l1 = new JLabel("Mile :");
		JLabel l2 = new JLabel("Kilometer :");
		JLabel l3 = new JLabel("Pound :");
		JLabel l4 = new JLabel("Kilogram: ");
		JLabel l5 = new JLabel("Gallon :");
		JLabel l6 = new JLabel("Litre :");
		JLabel l7 = new JLabel("Fahrenheit :");
		JLabel l8 = new JLabel("Centigrade :");
		JLabel s1 = new JLabel(" ");
		JLabel s2 = new JLabel(" ");
		
		JButton but = new JButton("Convert");
		
		panel.add(l1);
		panel.add(mile);
		
		panel.add(l2);
		panel.add(kilometer);
		
		panel.add(l3);
		panel.add(pound);
		
		panel.add(l4);
		panel.add(kilogram);
		
		panel.add(l5);
		panel.add(gallon);

		panel.add(l6);
		panel.add(litre);

		panel.add(l7);
		panel.add(fahrenheit);

		panel.add(l8);
		panel.add(centigrade);
		
		panel.add(s1);
		panel.add(s2);
		panel.add(but);
		
		but.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				kilometer.setText(convert(mile, 0.6213f));
				kilogram.setText(convert(pound, 0.453592f));
				litre.setText(convert(gallon, 3.78541f));
				centigrade.setText(convertFtoC(fahrenheit));
			}
			
			public String convert(JTextField tf, float conversion){
				float i = Float.parseFloat(tf.getText().length() > 0 ?tf.getText():"0");
				i = i * conversion;
				return String.format("%.2f", i);
			}
			
			public String convertFtoC(JTextField tf){
				float i = Float.parseFloat(tf.getText().length() > 0 ?tf.getText():"0");
				i = (i - 32)* 0.555f;
				return String.format("%.2f", i);
			}
			
		});

		frame.setSize(600, 200);

		frame.add(panel);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	    Container contentPane = frame.getContentPane();
	    contentPane.setBackground(Color.gray);
	    frame.setVisible(true);
	

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			    new ConversionUtilityUI();
	}

}
