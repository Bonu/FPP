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
	 * The Rhombus 
	 * @param args
	 */
	
	public void displayRhombus(int num){
		// TODO Auto-generated method stub
//				int refVal = (num/2)+1;
//				int refVal1 = refVal;
//				int refVal2 = 1;
//				int val1 = 1;
//				System.out.println(num);
////				System.out.println(refVal);
//				
//				for(int a=1;a<=refVal;a++) {
//					for(int i=1; i<= refVal1; i++){
//						System.out.printf(" ");
//					}
//					refVal1--;
//					
//					for(int j=1;j<=val1;j++){
//						System.out.printf("*");
//					}
//					val1 = val1 + 2;
//					System.out.println(" ");
//				}
				
				num = num - 2;
				int refVal = (num/2)+1;
				int refVal1 = refVal;
				int refVal2 = 1;
				int val1 = num;
				
				for(int a=1;a<=refVal;a++) {
//					System.out.printf("Loop %d\n",a);
					for(int i=1; i<= refVal1; i++){
						System.out.printf("%d",a);
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
