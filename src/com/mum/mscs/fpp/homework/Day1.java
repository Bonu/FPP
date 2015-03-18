/**
 * 
 */
package com.mum.mscs.fpp.homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
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
//		d1.amountDetails();
//		d1.convertSecondsToHMS();
		d1.checkLeapYear();
//		d1.uniqueUserName();
		d1.nextYearPopulation();
		d1.formattedDate();
	}

	/**
	 * Print amount details
	 * 
	 * output:
	 * Enter the amount :
		11.56
		Your amount 11.56 consists of 
		11 :Dollars
		2 :Quarters
		0 :Dimes
		1 :Nickel
		1 :Pennie(s)
	 */
	public void amountDetails() {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the amount :");
		
		float fnum = in.nextFloat();
		
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
	 * 
	 * output:
	 * Enter time in seconds :
		36254
		Input time in seconds :36254
		10 Hours: 4 Minutes: 14 Seconds
	 * 
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

	/** 
	 * Check the given year is Leap year or not using ternary operator. 
	 * 
	 * output:
	 * Enter the year in 4-digit format:
		2015
		The year 2015 is NOT LEAP YEAR
	 */
	public void checkLeapYear(){

		Scanner getYear = new Scanner(System.in);
		System.out.println("Enter the year in 4-digit format:");
		int year = getYear.nextInt();
		System.out.printf("The year %d is %s",year, (year % 4 ==0)? "LEAP YEAR":"NOT LEAP YEAR");
		
	}
	
	/**
	 * Implement necessary string methods and random number to produce a
	 * username based on the user's first and last names. Assumes the last name
	 * is at least five characters long. 
	 * 
	 * Username = First character from first name and first five characters 
	 * from last name + three digit random number.
	 * 
	 * output:
	 *  First Name: Pranab
		Last Name: Mukherjee
		User Name :PMukhe111
	 */
	public void uniqueUserName() {
		
		String firstName="Pranab";
		String lastName = "Mukherjee";
	
		Random ra = new Random();
		
		int ira = ra.nextInt();
		
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("User Name :"+firstName.charAt(0) + lastName.substring(0,5)+Integer.toString(ira).substring(1,4));
		
	}

	/**
	 * 5. The U.S. Census Bureau projects population based on the following
	 * assumptions: 
	 * 	One birth every 10 seconds 
	 * 	One death every 13 seconds
	 * 	One new immigrant every 50 seconds 
	 * 	Write a program to display the population of the next year. Assume the current population is 312,132,486
	 * 	and one year has 365 days.
	 * 
	 * output:
	 *  Birth Rate: 1 per 10 seconds
		Deadth Rate: 1 per 13 seconds 
		New Imigrant: 1 per 50 seconds
		Next one year population : 1358530312132486
	 */
	public void nextYearPopulation(){
		
		int birthRateyear = 6*60*24*365;
		int deadthRate = (86400/13)*365;
		int immigrant = (86400/50)*365;
		int currentPopulation = 312132486;
		
		System.out.println("Birth Rate: 1 per 10 seconds");
		System.out.println("Deadth Rate: 1 per 13 seconds ");
		System.out.println("New Imigrant: 1 per 50 seconds");
		System.out.println("Next one year population : "+ ((birthRateyear + immigrant) - deadthRate) + currentPopulation);
	}
	

	/**
	 * 6. Perform the following using printf(). 
	 * Date d = new Date(); 
	 * String s = Hello; 
	 * 	a. Retrieve weekday name(Wednesday) 
	 * 	b. Retrieve the time is PM or AM 
	 * 	c. Retrieve the date in US date format(MM/dd/yyyy) 
	 * 	d. Retrieve the hash code for the string S
	 * 
	 * Note: Since the required methods in Day class are deprecated, 
	 * Gregorian Calendar is used in this program.
	 * 
	 * output:
	 *  Birth Rate: 1 per 10 seconds
		Deadth Rate: 1 per 13 seconds 
		New Imigrant: 1 per 50 seconds
		Next one year population : 1358530312132486
	 */
	public void formattedDate() {
		
		Date date = new Date();
		String[] day = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String s = "Hello";
		Calendar calendar = new GregorianCalendar();
		
//		calendar.setTime(date);
		System.out.println("Week Day :"+day[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("Time is PM or AM :"+ (calendar.get(Calendar.AM_PM) == 1? "PM":"AM"));
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setCalendar(calendar);
		System.out.println("US Date Format :"+sdf.format(date));
		
		System.out.println("String \"Hello\" hash code:"+s.hashCode());
	}
	
	

}
