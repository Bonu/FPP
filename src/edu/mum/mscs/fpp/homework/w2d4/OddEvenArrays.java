/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d4;

import java.util.Arrays;

/**
 * 
 * 2.	Create a local class to determine the given array of input is even oriented or odd oriented.
	Example : [ 10, 15, 20, 30, 5]
	Sum of Even numbers : 60
	Sum of Odd numbers : 20
	Conclude that the given array is Even oriented.
 * 
 * output:
 *  1. OddEvenArrays Constructor called...
	2. Outer method determineEvenOdd is called..
	3. Local constructor called..
	4. arrayOrientation method is called
	5. The array [23, 54, 67, 24, 57, 87, 34, 60, 58, 23] is Odd Oriented
 *
 * @author janardhanbonu
 *
 */
public class OddEvenArrays {
	
	public OddEvenArrays() {
		System.out.println("1. OddEvenArrays Constructor called...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		OddEvenArrays oea = new OddEvenArrays();
		oea.determineEvenOdd();
		
	}
	
	public void determineEvenOdd(){
		System.out.println("2. Outer method determineEvenOdd is called..");
		
		class local{
			int[] numbers = {23,54,67,24,57,87,34,60,58,23};
			local(){
				System.out.println("3. Local constructor called..");
			}
			public void arrayOrientation(){
				System.out.println("4. arrayOrientation method is called");
				int evens = 0;
				int odds = 0;
				for (int i = 0; i < numbers.length; i++) {
					if(i == 0){
						evens = i;
					}else if(i%2 == 0){
						evens += i;
					}else {
						odds += i;
					}
				}
				System.out.printf("5. The array %s is %s Oriented",Arrays.toString(numbers),(evens > odds)?"Even":"Odd");
			}
		}
		local l = new local();
		l.arrayOrientation();
	}

}
