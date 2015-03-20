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
		
		---*         ---        *
		--***    =   --    +   ***
		-*****       -        *****
		
		--***    =   --    +   ***
		---*         ---        *
		
	 * 
	 * Output: 
	 *  1
		-* 
		3
		--* 
		-*** 
		--* 
		5
		---* 
		--*** 
		-***** 
		--*** 
		---* 
		7
		----* 
		---*** 
		--***** 
		-******* 
		--***** 
		---*** 
		----* 
		9
		-----* 
		----*** 
		---***** 
		--******* 
		-********* 
		--******* 
		---***** 
		----*** 
		-----* 
	 * The Rhombus 
	 * @param args
	 */
	
	public void displayRhombus(int num){
		int refVal = (num/2)+1;
		int refVal1 = refVal;
		int val1 = 1;
		System.out.println(num);
		
		for(int a=1;a<=refVal;a++) {
			for(int i=1; i<= refVal1; i++){
				System.out.printf("-");
			}
			refVal1--;
			
			for(int j=1;j<=val1;j++){
				System.out.printf("*");
			}
			val1 = val1 + 2;
			System.out.println(" ");
		}
		
		num = num - 2;
		refVal1 = 1;
		val1 = num;
		
		for(int a=1;a<=refVal-1;a++) {
			for(int i=1; i<=refVal1+1; i++){
				System.out.printf("-");
			}
			refVal1++;
			for(int j=1;j<=val1;j++){
				System.out.printf("*");
			}
			val1 = val1  - 2;
			System.out.println(" ");
		}
				
	}
	public static void main(String[] args) {
		
		Rhombus rhbs1 = new Rhombus();
		rhbs1.displayRhombus(1);
		rhbs1.displayRhombus(3);
		rhbs1.displayRhombus(5);
		rhbs1.displayRhombus(7);
		rhbs1.displayRhombus(9);
	}
	
}
