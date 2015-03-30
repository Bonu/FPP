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
public class StringUtilityUI_2 {

	JFrame frame = new JFrame("Default Panel Alignment Demo");
	JTextField  tInput = new JTextField(20);
	JTextField  tOutput = new JTextField(20);
	
	/**
	 * 
	 */
	public StringUtilityUI_2() {
		
		Container container = frame.getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		tInput.setBounds(300, 70, 200, 20);
		tOutput.setBounds(300, 120, 200, 20);
		
		
		JLabel l1 = new JLabel("Input:");
		l1.setBounds(300,50,50,20);
		
		JLabel l2 = new JLabel("Output:");
		l2.setBounds(300,100,50,20);
		
		panel.add(tInput);
		panel.add(tOutput);
		panel.add(l1);
		panel.add(l2);
		
		
		JButton bCountLetters = new JButton("Count Letters");
		bCountLetters.setBounds(50, 50, 200, 20);
		bCountLetters.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				coutLetters();
			}
			
			public void coutLetters(){
				tOutput.setText(tInput.getText() != null ? (tInput.getText()).trim().length()+"" : "0");
			}
			
		});
		panel.add(bCountLetters);
		
		JButton bReverseLetters = new JButton("Reverse Letters");
		bReverseLetters.setBounds(50, 100, 200, 20);
		bReverseLetters.addActionListener(new ActionListener(){

			String reverse = "";
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("String Reverse :" + reverseStr(tInput.getText()));
				tOutput.setText(reverseStr(tInput.getText().toString()));
			}
			
		    public String reverseStr(String str){
		         
		        if(str.length() == 1){
		            return str;
		        } else {
		            reverse = reverse + str.charAt(str.length()-1) + reverseStr(str.substring(0,str.length()-1));
		            return reverse;
		        }
		    }
			
		});
		panel.add(bReverseLetters);

		JButton bRemoveDuplicates = new JButton("Remove Duplicates");
		bRemoveDuplicates.setBounds(50, 150, 200, 20);
		bRemoveDuplicates.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				removeDuplicates();
			}
			
			public void removeDuplicates() {
				char[] chars = (tInput.getText()).toCharArray();
				String rStr = "";
				for (int i = 0; i < chars.length; i++) {
					if(rStr.indexOf(chars[i]) < 0){
						rStr += chars[i];
					}
				}
				tOutput.setText(rStr);
			}
			
		});
		panel.add(bRemoveDuplicates);
		
		frame.setSize(600, 250);
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

		new StringUtilityUI_2();
	}

}
