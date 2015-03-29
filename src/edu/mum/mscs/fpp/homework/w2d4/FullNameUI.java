/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author janardhanbonu
 *
 */
public class FullNameUI {

	JFrame mframe = new JFrame("Display Full Name");
	JTextField jtff = null;
	JTextField jtfl = null;
	JTextField jtffl = null;
	
	public FullNameUI() {
		
		 mframe.setSize(300,300);
		 
		 Label space1 = new Label(" ");
		 Label space2 = new Label(" ");
		 Label space3 = new Label(" ");
		 Label space4 = new Label(" ");
		 Label space5 = new Label(" ");
		 Label space6 = new Label(" ");
		 Label space7 = new Label(" ");
		 
		 
		 Label l1 = new Label("Frist Name");
		 Label l2 = new Label("Last Name");
		 Label l3 = new Label("Full Name");
		 jtff = new JTextField(30);
		 jtfl = new JTextField(30);
		 jtffl = new JTextField(50);
		 
		 JButton button = new JButton("Full Name");
		 
		 button.addActionListener(
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						jtffl.setText(jtff.getText() + jtfl.getText());
					}
				}); 
		 JPanel panel = new JPanel(new GridLayout(5,2));
		 
		 panel.add(space1);
		 panel.add(space2);
		 panel.add(l1);
		 panel.add(jtff);
		 panel.add(l2);
		 panel.add(jtfl);
		 panel.add(l3);
		 panel.add(jtffl);
		 panel.add(button);
		 
		 mframe.add(panel);
	     mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	     Container contentPane = mframe.getContentPane();
	     contentPane.setBackground(Color.gray);
	     mframe.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FullNameUI fnui = new FullNameUI();
		
		
	}

}
