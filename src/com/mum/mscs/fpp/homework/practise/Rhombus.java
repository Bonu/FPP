/**
 * 
 */
package com.mum.mscs.fpp.homework.practise;

/**
 * @author 984417
 *
 */
public class Rhombus {

	/**
	 * 
	 */
	public Rhombus() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 	---*---
		--***--
		-*****-
		--***--
		---*---
		
		---*
		--***
		-*****
		
		--***
		---*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int refVal = (num/2)+1;
		int refVal1 = refVal;
		int refVal2 = 1;
		int val1 = 1;
		System.out.println(num);
		System.out.println(refVal);
		
		for(int a=1;a<=refVal;a++) {
			for(int i=1; i<= refVal1; i++){
				System.out.printf(" ");
			}
			refVal1--;
			
			for(int j=1;j<=val1;j++){
				System.out.printf("*");
			}
			val1 = val1 + 2;
			System.out.println(" ");
		}
		
		num = num - 2;
		refVal = (num/2)+1;
		refVal1 = refVal;
		refVal2 = 1;
		val1 = 1;
		System.out.println(num);
		System.out.println(refVal);
		
		for(int a=1;a<=refVal;a++) {
			for(int i=1; i<= refVal1; i++){
				System.out.printf(" ");
			}
			refVal1--;
			for(int j=1;j<=val1;j++){
				System.out.printf("*");
			}
			val1 = val1 + 2;
			System.out.println(" ");
		}
		

		
		
	}
	
	

}
