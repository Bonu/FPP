/**
 * 
 */
package edu.mum.mscs.fpp.homework.w3d5;

import java.util.Scanner;

/**
 * 3.	Calculate factorial of a number using function by passing input. 
 * Your input is less than zero or greater than 50 throw IllegalArgumentException.
 * 
 * Output:
 * 
 *  Please Integer Number  between 0-50 : 
	fact
	Please enter only number.java.lang.NumberFormatException: For input string: "fact"
	
	Please Integer Number  between 0-50 : 
	220
	Enter integer between 0-50 number.java.lang.IllegalArgumentException

	Please Integer Number  between 0-50 : 
	5
	120
	
 * @author janardhanbonu
 *
 */
public class Factorial {

	public int fact(int n){
		if(n == 1){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial pi = new Factorial();
		System.out.println("Please Integer Number  between 0-50 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int inputInteger = 0;

		try{
			inputInteger = Integer.parseInt(input);
			if(inputInteger < 0 || inputInteger > 50){
				throw new IllegalArgumentException();
			}else{
				System.out.println(pi.fact(inputInteger));
			}
		}catch(NumberFormatException e){
			System.err.println("Please enter only number."+e);
		}catch(IllegalArgumentException e){
			System.err.println("Enter integer between 0-50 number."+e);
		}finally {
			sc.close();
		}
	}
}
