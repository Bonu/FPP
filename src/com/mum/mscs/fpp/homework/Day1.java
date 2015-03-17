/**
 * 
 */
package com.mum.mscs.fpp.homework;

import java.util.Scanner;

/**
 * @author 984417
 *
 */
public class Day1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Day 1 - Homework");
		Day1 d1 = new Day1();
		// d1.amountDetails();
		d1.convertSecondsToHMS();
	}

	/**
	 * Print amount details
	 */
	public void amountDetails() {

		float fnum = 11.56f;
		int inum = (int) fnum;
		float decimalnum = fnum - inum;

		System.out.printf("Your amount %.2f consists of \n", fnum);
		int idecimalnum = (int) (decimalnum * 100);
		System.out.println(inum + " :Dollars\n" + (idecimalnum / 25)
				+ " :Quarters\n" + ((idecimalnum % 25) / 10) + " :Dimes\n"
				+ (((idecimalnum % 25) % 10) / 5) + " :Nickel\n"
				+ ((((idecimalnum % 25) % 10) % 5) / 1) + " :Pennie(s)");

	}

	/**
	 * 2. Computes the number of hours, minutes, and seconds that are equivalent
	 * to the number of seconds entered by the user.
	 */
	public void convertSecondsToHMS() {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter time in seconds :");
		int iSeconds = in.nextInt();

		System.out.println("Input time in seconds :" + iSeconds);
		System.out.printf("%d Hours: %d Minutes: %d Seconds",
				(iSeconds / 3600), ((iSeconds % 3600) / 60),
				(((iSeconds % 3600) % 60)));

	}

	/** Check the given year is Leap year or not using ternary operator. */
	public void checkLeapYear(){
		Scanner getYear = new Scanner(System.in);

		System.out.println("Enter the year in 4-digit format:");
		int year = getYear.nextInt();
		
		
	}
	
	
	
	/**
	 * Implement necessary string methods and random number to produce a
	 * username based on the user's first and last names. Assumes the last name
	 * is at least five characters long. 
	 * 
	 * Username = First character from first name and first five characters from last name + three digit random
	 * number.
	 */

	/**
	 * 5. The U.S. Census Bureau projects population based on the following
	 * assumptions: 
	 * 	One birth every 10 seconds 
	 * 	One death every 13 seconds
	 * 	One new immigrant every 50 seconds 
	 * 	Write a program to display the population of the next year. Assume the current population is 312,132,486
	 * 	and one year has 365 days.
	 */

	/**
	 * 6. Perform the following using printf(). 
	 * Date d = new Date(); 
	 * String s = “Hello”; 
	 * 	a. Retrieve weekday name(Wednesday) 
	 * 	b. Retrieve the time is PM or AM 
	 * 	c. Retrieve the date in US date format(mm/dd/yyyy) 
	 * 	d. Retrieve the hash code for the string S
	 */

}
