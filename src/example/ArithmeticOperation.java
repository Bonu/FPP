package example;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ArithmeticOperation extends JFrame{

	private int n1;
	private int n2;
	private int sum;
	private int diff;
	String s = "Hello";
	int a =  s.charAt(1);
	
	//Defining JLabel
	private JLabel lblNumber1;
	private JLabel lblNumber2;
	private JLabel lblAsnwer;
	
	//Defining JTextField
	private JTextField tfNumber1;
	private JTextField tfNumber2;
	private JTextField tfAnswer;
	
	//Defining JButton
	private JButton btnAdd;
	private JButton btnSubstract;
	private JButton btnClear;
	private JButton btnExit;
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 300;
	
	public ArithmeticOperation() {
	
		super("Demo Arithmetic Operation");
		
		//Define your layout
		//setLayout(new FlowLayout());
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//change the background color of the frame
		getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);
		

		//Initialization
		lblNumber1 = new JLabel("Number 1");
		lblNumber1.setBounds(20, 20, 100, 20);
		lblNumber2 = new JLabel("Number2");
		lblNumber2.setBounds(20, 60, 100, 20);
		lblAsnwer = new JLabel("Answer : ");
		lblAsnwer.setBounds(20, 170, 100, 25);
				
		tfNumber1 = new JTextField(6);
		tfNumber1.setBounds(110, 15, 100, 25);
		
		tfNumber2 = new JTextField(6);
		tfNumber2.setBounds(110, 55, 100, 25);
		tfAnswer = new JTextField();
		tfAnswer.setBounds(110, 170, 100, 25);
		
		btnAdd    = new JButton("Sum");
		btnAdd.setBounds(50, 110, 100, 25);
				
		btnSubstract = new JButton("Difference");
		btnSubstract.setBounds(165, 110, 100, 25);

		btnClear = new JButton("Clear");
		btnClear.setBounds(210, 220, 70, 25);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(10, 220, 70, 25);
		
		//add to the frame
		add(lblNumber1);
		add(tfNumber1);
		add(lblNumber2);
		add(tfNumber2);
		add(btnAdd);
		add(btnSubstract);
		add(lblAsnwer);
		add(tfAnswer);
		add(btnClear);
		add(btnExit);
		
		//Event handling for Button
		ButtonHandler btnHandler = new ButtonHandler();
		btnAdd.addActionListener(btnHandler);
		btnSubstract.addActionListener(btnHandler);
		btnClear.addActionListener(btnHandler);
		btnExit.addActionListener(btnHandler);
	}
	
	//define event handling for button handler
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == btnClear){
				tfAnswer.setText(null);
				tfNumber1.setText(null);
				tfNumber2.setText(null);
			}else if(event.getSource() == btnExit){
				System.exit(0);
			}else
			{
				String s1 = tfNumber1.getText();
				String s2 = tfNumber2.getText();
				
				try  
				  {  
				    n1 = Integer.parseInt(s1);  
				  }  
				  catch(NumberFormatException nfe)  
				  {  
				    n1 = 0;
				    tfNumber1.setText("0");
				  }  
			
				try  
				  {  
				    n2 = Integer.parseInt(s2);  
				  }  
				  catch(NumberFormatException nfe)  
				  {  
				    n2 = 0; 
				    tfNumber2.setText("0");
				  }  
				sum = n1 + n2;
				diff = n1 - n2;
				
				if(event.getSource() == btnAdd){
					//JOptionPane.showMessageDialog( null, "Sum = " + sum,
							//"", JOptionPane.PLAIN_MESSAGE );
					
					String answer =  String.format( "%d",sum);
					tfAnswer.setText(answer);
					
				}else if(event.getSource() == btnSubstract){
					//JOptionPane.showMessageDialog( null, "Difference = " + diff,
							//"", JOptionPane.PLAIN_MESSAGE );
					String answer =  String.format( "%d",diff);
					tfAnswer.setText(answer);
					}	
				}
			}
		}
	}

