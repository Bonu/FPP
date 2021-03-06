/**
 * AgeCalclator.java
 */
package edu.mum.mscs.fpp.homework.w1d3;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * 4. Create an array which stores the person’s date of birth and perform the following operations on the array.
		a. Calculate the age of a person and display their age.
		b. Sort the birth dates. 
		
  output:
  
  	Date :Sat Apr 12 17:53:40 CST 1980	 Age :35
	Date :Thu May 11 17:53:40 CDT 1950	 Age :65
	Date :Sat Jun 10 17:53:40 CDT 1967	 Age :48
	Date :Tue Jul 11 17:53:40 CDT 1978	 Age :37
	Date :Thu Aug 17 17:53:40 CDT 1989	 Age :26
	Date :Sun Sep 16 17:53:40 CDT 1990	 Age :25
	Date :Sun Oct 25 17:53:40 CST 1998	 Age :17
	Date :Sat Nov 21 17:53:40 CST 1987	 Age :28
	Date :Wed Dec 22 17:53:40 CST 1976	 Age :39
	Date :Sun Jan 23 17:53:40 CST 1966	 Age :49
	
	---- dates are sorted-----
	
	Date :Thu May 11 17:53:40 CDT 1950
	Date :Sun Jan 23 17:53:40 CST 1966
	Date :Sat Jun 10 17:53:40 CDT 1967
	Date :Wed Dec 22 17:53:40 CST 1976
	Date :Tue Jul 11 17:53:40 CDT 1978
	Date :Sat Apr 12 17:53:40 CST 1980
	Date :Sat Nov 21 17:53:40 CST 1987
	Date :Thu Aug 17 17:53:40 CDT 1989
	Date :Sun Sep 16 17:53:40 CDT 1990
	Date :Sun Oct 25 17:53:40 CST 1998
	
		        
 * @author janardhanbonu
 *
 */
public class AgeCalculator {
	
	private Calendar now = new GregorianCalendar();

	public Date[] dates = {
			extractDate(3,12,1980),
			extractDate(4,11,1950),
			extractDate(5,10,1967),
			extractDate(6,11,1978),
			extractDate(7,17,1989),
			extractDate(8,16,1990),
			extractDate(9,25,1998),
			extractDate(10,21,1987),
			extractDate(11,22,1976),
			extractDate(12,23,1965)
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AgeCalculator ac = new AgeCalculator();
		ac.displayAge();
		ac.sortDates();
		ac.displayDates();
	}
	
	
	public void displayAge(){
		Calendar bDate = new GregorianCalendar();
		for (Date date : dates) {
			bDate.setTime(date);
			/* 
			 * To keep it simple only the years difference is calculated
			 * instead of calculating in time 
			 */
			int age = now.get(Calendar.YEAR) - bDate.get(Calendar.YEAR);
			System.out.println("Date :"+date+"\t Age :"+age);
		}
	}
	
	public Date extractDate(int month, int day, int year) {
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(year, month, day);
		return cal.getTime();
	}
	
	public void sortDates() {
		Arrays.sort(dates);
		System.out.println("\n---- dates are sorted-----\n");
	}
	
	private void displayDates() {
		for (Date date : dates) {
			System.out.println("Date :"+date.toString());
		}
	}
	

}
