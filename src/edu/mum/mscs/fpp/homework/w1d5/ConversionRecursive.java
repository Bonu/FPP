/**
 * ConversionRecursive
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 *6.	Convert the digit input into words using recursion.
		Example :  Input : 562
		                   Output : Five Six Two
		output: 
		THREE FOUR FIVE SIX 
		
		 */

public class ConversionRecursive {

	public String[] numbers = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	public static void main(String[] args) {
		
		ConversionRecursive cr = new ConversionRecursive();
		cr.convert(3456);
		
	}
	
	public void convert(int number){
		if(number > 0){
			convert(number/10);
			System.out.printf("%s ",numbers[(number%10)]);
		}
	}

}
