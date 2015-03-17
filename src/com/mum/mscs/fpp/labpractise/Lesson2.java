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
		int number = 54321;
		int value = 45321%10;
		int valuex = 45321/10;
		
		int value1 = 45321%100;
		System.out.println("Print number"+ value);
		System.out.println("Print number"+ valuex);
		System.out.println("Print number"+ value1);

		int divider = 10;
		StringBuffer sb = new StringBuffer();
		while( number > 0) {
			int quotient = number / divider;
			int reminder = number % divider;
			sb.append(quotient);
			divider = divider * 10;
			number = reminder;
		}
		
		System.out.println("Reverse Number: "+sb.toString());
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
	
	public int getBonus(int salesAmount, int percent, String performance){
		System.out.println("Performance  :"+performance);
		return (salesAmount*percent)/100;
	}
	
	public void printNumberReverse(){
		
		System.out.println("Enter the Number to display in Reverse Order :");
		Scanner getNumber = new Scanner(System.in);
		
		int number = getNumber.nextInt();
		
		
		
		
		
		
		
	}

}
