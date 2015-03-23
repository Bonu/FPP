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
 * @author janardhanbonu
 *
 */
public class DecimalToBinaryRecursive {

	public String binary="";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalToBinaryRecursive dbr = new DecimalToBinaryRecursive();
		dbr.convert(25);
		System.out.println("Decimal : 25"+" Binary : "+dbr.binary);
		dbr.convert(4);
		System.out.println("Decimal : 4 "+" Binary : "+dbr.binary);
	}
	
	public String convert(int number){
		binary="";
		decimaltobinary(number);
		return binary;
	}
	
	public  void decimaltobinary(int number){
		if(number > 0){
			binary = (number%2) + binary;
			decimaltobinary(number/2);
		}
	}
}
