/**
 * 
 */
package edu.mum.mscs.fpp.homework.w1d2;

import java.util.Scanner;

/**
 * @author 984417
 *
 */
public class Week1Day2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Day 2 - Homework");
		
		Week1Day2 d2 = new Week1Day2();
		
//		d2.weightOnPlanets();
//		d2.compareUSMexicoPopulation();
		d2.rhombus();
//		d2.studentGrades();
		
	}

	/**
	 * 1. Write a program that prompts the user to input an odd digit should be
	 * below 10. The program should then output a rhombus of that size using the
	 * digit.
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
	 * 
	 * output:
	 * Enter odd number between 1 to 10:
	 * 
	
	 * Output: 
		1
		 * 
		3
		  * 
		 *** 
		  * 
		5
		   * 
		  *** 
		 ***** 
		  *** 
		   * 
		7
		    * 
		   *** 
		  ***** 
		 ******* 
		  ***** 
		   *** 
		    * 
		9
		     * 
		    *** 
		   ***** 
		  ******* 
		 ********* 
		  ******* 
		   ***** 
		    *** 
		     * 

	 * The Rhombus 
	 * @param args
	 */
	

	public void rhombus() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter odd number between 1 to 10:");
		int num = input.nextInt();

		if (num < 10 && (num % 2) == 1) {
			int refVal = (num/2)+1;
			int refVal1 = refVal;
			int val1 = 1;
			System.out.println(num);
			
			
			/*  The Rhombus diagram has 2 basic triangles and each has 2 triangles again.
			 *  The upper triangle is made up of spaces and '*' symbols in a defined order
			 *  of odd number. A traingle with empty space is created first by taking the 
			 *  middle line of the triangle as reference point and decrease the number of 
			 *  spaces one by one for the next lines.
			 *  In the same iteration create a loop to print * and add more * for next line 
			 *  in odd number sequence.
			 *  
			 *  the lower triangle is made of space and '*' symbols in a decreasing order 
			 *  compare to the upper triangle.
			 */
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
			refVal1 = 1;
			val1 = num;
			
			for(int a=1;a<=refVal-1;a++) {
				for(int i=1; i<=refVal1+1; i++){
					System.out.printf(" ");
				}
				refVal1++;
				for(int j=1;j<=val1;j++){
					System.out.printf("*");
				}
				val1 = val1  - 2;
				System.out.println(" ");
			}
		} else {
			System.out.println("Not a valid odd number between 1 to 10");
		}
	}

	/**
	 * 2. Write a Program using switch statement to find the weight of a person
	 * in various planets according to the choice of user input.
	 * 
	 * Get the input from the user in lbs.
	 * Weight = Input * Relative gravity
	 * Choice Planet Relative gravity
	 * 
	 * 1 Venus 0.78
	 * 2 Mars 0.39
	 * 3 Jupiter 2.65
	 * 4 Saturn 1.17
	 * 5 Uranus 1.05
	 * 6 Neptune 1.23
	 * 
	 * Output: 
	 * Enter user weight:
		100
		Choose planet below :
		 1. Venus 0.78 
		 2. Mars 0.39 
		 3. Jupiter 2.65 
		 4. Saturn 1.17 
		 5. Uranus 1.05 
		 6. Neptune 1.23
		3
		Weight on Jupiter :265.0
	 */
	
	public void weightOnPlanets() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user weight:");
		int userweight = input.nextInt();
		
		System.out.println("Choose planet below :\n "
				+ "1. Venus 0.78 \n "
				+ "2. Mars 0.39 \n "
				+ "3. Jupiter 2.65 \n "
				+ "4. Saturn 1.17 \n "
				+ "5. Uranus 1.05 \n "
				+ "6. Neptune 1.23");
		int planetChoice = input.nextInt();
		
		switch (planetChoice) {
		case 1:
			System.out.println("Weight on Venus :"+ (userweight * 0.78));
			break;
		case 2:
			System.out.println("Weight on Mars :"+ (userweight * 0.39));
			break;
		case 3:
			System.out.println("Weight on Jupiter :"+ (userweight * 2.65));
			break;
		case 4:
			System.out.println("Weight on Saturn :"+ (userweight * 1.17));
			break;
		case 5:
			System.out.println("Weight on Uranus :"+ (userweight * 1.05));
			break;
		case 6:
			System.out.println("Weight on Neptune :"+ (userweight * 1.23));
			break;
		default:
			break;
		}
	}
	
	/**
	 * 3. Assume that the population of Mexico is 114 million and that the
	 * population increases 10.01 percent annually. Assume that the population
	 * of the United States is 312 million and that the population is reduced
	 * 5.15 percent annually. 
	 * Write an application that displays the populations
	 * for the two countries every year until the population of Mexico exceeds
	 * that of the United States, and display the number of years it took.
	 * 
	 * Output:
	 *  Mexico population:1.14E8 US Population:3.12E8Number of years :0.0
		Mexico population:1.254114E8 US Population:2.95932E8Number of years :1.0
		Mexico population:1.368228E8 US Population:2.79864E8Number of years :2.0
		Mexico population:1.482342E8 US Population:2.63796E8Number of years :3.0
		Mexico population:1.596456E8 US Population:2.47728E8Number of years :4.0
		Mexico population:1.71057E8 US Population:2.3166E8Number of years :5.0
		Mexico population:1.824684E8 US Population:2.15592E8Number of years :6.0
		Mexico population:1.938798E8 US Population:1.99524E8Number of years :7.0
	 */
	
	public void compareUSMexicoPopulation() {
		
		for(double m=114000000,u=312000000,i=0;m < u;m=m+11411400,u=u-16068000,i++) {
			System.out.println("Mexico population:"+m+" US Population:"+u +"Number of years :"+i);
		}
		
	}
	
	
	/**
	 * 4. Write a program that grades multiple-choice tests. Assume there are
	 * eight students and ten questions, and the answers are stored in a
	 * two-dimensional array. Each row records a student’s answers to the
	 * questions, as shown in the following array.
	 * 
	 * The key is stored in a one-dimensional array:
	 * 
	 * Your program grades the test and displays the result. It compares each
	 * student’s answers with the key, counts the number of correct answers, and
	 * displays it.
	 * 
	 * Output: Day 2 - Homework
	 * 
	 * Student 0's correct count is 7
	 * Student 1's correct count is 6 
	 * Student 2's correct count is 5 
	 * Student 3's correct count is 4 
	 * Student 4's correct count is 8 
	 * Student 5's correct count is 7 
	 * Student 6's correct count is 7 
	 * Student 7's correct count is 7
	 * 
	 */
	public void studentGrades() {
		
		char [][] studentAnswers = {
						{'A','B','A','C','C','D','E','E','A','D'},
						{'D','B','A','B','C','A','E','E','A','D'},
						{'E','D','D','A','C','B','E','E','A','D'},
						{'C','B','A','E','D','C','E','E','A','D'},
						{'A','B','D','C','C','D','E','E','A','D'},
						{'B','B','E','C','C','D','E','E','A','D'},
						{'B','B','A','C','C','D','E','E','A','D'},
						{'E','B','E','C','C','D','E','E','A','D'}
						};
		
		char[] keysheet={'D','B','D','C','C','D','A','E','A','D'};
		
		for (int i = 0; i < studentAnswers.length; i++) {
			int count = 0;
			for (int j = 0; j < studentAnswers[i].length; j++) {
				if(studentAnswers[i][j]==keysheet[j]){
					count++;
				}
			}
			System.out.printf("Student %d's correct count is %d\n",i,count);
		}
	
	}
	
}
