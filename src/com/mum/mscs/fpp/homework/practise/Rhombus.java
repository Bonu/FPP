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
		int refVal2 = refVal;
		
		System.out.println(num);
		System.out.println(refVal);
		for(int a=1;a<=num;a++) {
			for(int i=1;i<= refVal1;i++){
				System.out.printf("-");
				refVal1 = refVal1 - 1;
			}
			
			for(int b=refVal2;b >= 0 ;) {
				System.out.printf("*");
				refVal2 = refVal2 + 1;
				b = b  - 2;
			}
			num = num -2;
			System.out.println("");
		}
		
		
	}

}
