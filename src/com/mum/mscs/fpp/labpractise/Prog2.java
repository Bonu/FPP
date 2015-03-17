/**
 * 
 */
package com.mum.mscs.fpp.labpractise;

/**
 * 
 * 1)	Create a class Prog2. Inside its main method, create float variables to store        
       each of the following numbers:    1.27, 3.881, 9.6, 5.231
              Output to the console the following two values:
              a. the sum of the floats as an integer, obtained by casting the sum to type int
              b. the sum of the floats as an integer, obtained by rounding the sum to the 
                  nearest integer, using the Math.round function.

 * @author 984417
 *
 */
public class Prog2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
