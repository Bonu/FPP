/**
 * 
 */
package com.mum.mscs.fpp.labpractise;

import java.util.Scanner;

/**
 * @author 984417
 *
 */
public class Lesson2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lesson 2");
		
		Lesson2 l2 = new Lesson2();
		
//		l2.calculateBonus();
//		l2.printNumberReverse();
//		l2.oddevenarray();
//		l2.cumulativeArray();
		l2.whileDemo();
		
	}
	
	/**
	 * 
	 * 1)	Create a class Prog2. Inside its main method, create float variables to store        
	 *      each of the following numbers:    1.27, 3.881, 9.6, 5.231
	 *             Output to the console the following two values:
	 *             a. the sum of the floats as an integer, obtained by casting the sum to type int
	 *             b. the sum of the floats as an integer, obtained by rounding the sum to the 
	 *                 nearest integer, using the Math.round function.
     *
	 *
	 */
	public void prog2(){
		
		float fnum1 = 1.27f;
		float fnum2 = 3.881f;
		float fnum3 = 9.6f;
		float fnum4 = 5.231f;
		
		float fnumtotal = fnum1 + fnum2+ fnum3 + fnum4;
		
		int intbycast = (int)fnumtotal;
		
		int intbyround = Math.round(fnumtotal);
		
		System.out.println("Sum of all floating numbers :"+fnumtotal);
		
		System.out.println("Integer obtained by casting the sum of type int :"+intbycast);
		
		System.out.println("Integer obtained by rounding the sum to nearest int :"+intbyround);
	}
	
	
	/**
	 * 2. Write a program to calculate the bonus according to the following Condition 
	 * a. If a sale is less than 5000 display “No Bonus”. 
	 * b. If a sale is between 5001 to 7000, calculate the bonus as 10% of Sales and display “Satisfactory”. 
	 * c. If a sale is between 7001 to 10000, calculate the bonus as 20% of Sales and display “Good” 
	 * d. If sale is greater than 10000, calculate the bonus as 35% of Sales and display “Excellent”
	 */
	public void calculateBonus() {
		
		System.out.println("Enter the Sales Amount :");
		Scanner getAmount = new Scanner(System.in);
		
		int salesAmount = getAmount.nextInt();
		
		if(salesAmount <= 5000) {
			System.out.println("No Bonus");
		} else if(salesAmount > 5000 && salesAmount <= 7000) {
			System.out.println("Bonus = "+getBonus(salesAmount, 10, "Satisfactory"));
		} else if(salesAmount > 7000 && salesAmount <= 10000) {
			System.out.println("Bonus = "+getBonus(salesAmount, 20, "Good"));
		} else if(salesAmount > 10000) {
			System.out.println("Bonus = "+getBonus(salesAmount, 35, "Excellent"));
			
		}
			
	}
	
	private int getBonus(int salesAmount, int percent, String performance){
		System.out.println("Performance  :"+performance);
		return (salesAmount*percent)/100;
	}
	
	/**
	 * 3.	Print the number in Reverse order. Eg: Input is : 4321 Output :1234
	 */
	public void printNumberReverse(){
		
		System.out.println("Enter the Number to display in Reverse Order :");
		Scanner getNumber = new Scanner(System.in);
		
		int number = getNumber.nextInt();
		
		int reverse = 0;
		while( number != 0) {
		      reverse = reverse * 10;
	          reverse = reverse + number % 10;
	          number = number/10;
		}
		
		System.out.println("Reverse Number: "+reverse);
		
	}
	
	/**
	 * 4.Create an array with 10 values. 
	 *    Copy the odd value in one array and Even Value in some other array.
	 */
	
	public void oddevenarray() {
		
		int iArray[] = {1,2,3,4,5,6,7,8,9,10};
		
		int evenArray[] = new int[iArray.length/2];
		int oddArray[] = new int[iArray.length/2];
		
		int j = 0;
		int k=0;
		for (int i : oddArray) {
			if(iArray[i] % 2 == 0) {
				evenArray[j]=iArray[i];
				System.out.println("Even Number :"+evenArray[j]);
				j++;
			} else {
				oddArray[k]=iArray[i];
				System.out.println("Odd  Number :"+ oddArray[k]);
				k++;
			}
		}
	}
	
	/**
	 * 5.	Given an array of double values, create another array of cumulative sums. 
	 * For example, if 5.0, 6.5, 7.3, 10.2 are the values then their cumulative sums 
	 * are 5.0, 11.5, 18.8, 29.0. 
	 */
	public void cumulativeArray() {
		
		double[] dArray = {5.0,6.5,7.3,10.2};
		
		for (int i = 1; i < dArray.length; i++) {
			dArray[i]= dArray[i]+dArray[i-1];
		}
		
		for (double d : dArray) {
			System.out.println(d);
		}
		
		
	}
	
	
    /**
     *  6.	Modify the WhileDemo.java, if the user tried more than three times to enter 
     * pin number, display the message as “Your card has been blocked! Come to bank to 
     * activate your card” 
     */
	
	public void whileDemo() {
		
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE MIDWEST ONE BANK.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		int numberoftries = 0;
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. remaining chances :"+(2 - numberoftries));
			System.out.print("ENTER YOUR PIN: ");
			if(numberoftries < 2){
				entry = keyboard.nextInt();
				numberoftries ++;
			} else {
				System.out.println("Your card has been blocked! Come to bank to activate your card");
				return;
				//break; // Check the SOP 'PIN ACCEPTED' in console using return / break
			}
			
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
	
	/**
	 * 7. Find the results of each of the following expressions using operator precedence
	 *  chart. Do the paper work. 
	 */

	
	
}
