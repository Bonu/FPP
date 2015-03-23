/**
 * 
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 *
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
			System.out.println(numbers[(number%10)]);
		}
	}

}
