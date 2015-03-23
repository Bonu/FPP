/**
 * DecimalToBinaryRecursive.java
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 * 1. Convert Decimal To Binary Recursively
 * Example: 25 - 11001
 * 
 * Output:
 * Decimal : 25 Binary : 11001
 * Decimal : 4  Binary : 100
 * 
 *
 */
public class DecimalToBinaryRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalToBinaryRecursive dbr = new DecimalToBinaryRecursive();
		System.out.printf("Decimal : 25  Binary : ");
		dbr.decimaltobinary(25);
		System.out.println();
		System.out.printf("Decimal : 4   Binary : ");
		dbr.decimaltobinary(4);
	}
	
	public  void decimaltobinary(int number){
		if(number > 0){
			decimaltobinary(number/2);
			System.out.printf("%d",number%2);
			
		}
	}
}
