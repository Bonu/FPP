/**
 * 
 */
package edu.mum.mscs.fpp.homework.w3d5;

import java.util.Scanner;

/**
 * 2.	Write your program to get the input of mark in the range of 0 to 100.  
 * Apply the necessary Exception handling to avoid negative, non-numbers.
 * 
 * Output:
 * Enter Integer number between 0 - 100 :
 * -12
	IllegalArgumentExceptionjava.lang.IllegalArgumentException
 * 
 * Enter Integer number between 0 - 100 :
	rock
	NumberFormatExceptionjava.lang.NumberFormatException: For input string: "rock"

 * @author janardhanbonu
 *
 */
public class MarksReader {

	public static void main(String args[]){
	
		System.out.println("Enter Integer number between 0 - 100 :");
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	int inputValue = 0;

	try{
		inputValue = Integer.parseInt(input);
		if(inputValue < 0 || inputValue > 100){
			throw new IllegalArgumentException();
		}
	}catch(NumberFormatException e){
		System.err.println("NumberFormatException" + e);
	}catch(IllegalArgumentException e){
		System.err.println("IllegalArgumentException"  + e);
	}finally{
		sc.close();
	}
	}

}
