/**
 * DemoCabinRental.java
 */
package edu.mum.mscs.fpp.homework.w2d1;



/** 
 * 1.3 Write a Java file named DemoCabinRental that creates an 
 *  object of each class, and demonstrate that all the methods work correctly
 * 
 *  output:
 *  Cabin Rental Constructor invoked
	Weekly Rental Rate is calculated
	HolidayCabinRental Constructor invoked
	Surcharges added to Weekly Rentral Rate
	Weekly Rental Rate for Summer Holiday Cabin is : 1100.00
 * 
 * @author janardhanbonu
 *
 */
public class DemoCabinRental {

	public static void main(String[] args) {
		
		HolidayCabinRental hcr = new HolidayCabinRental(2);
		System.out.printf("Weekly Rental Rate for Summer Holiday Cabin is : %.2f\n", hcr.getWeeklyRentalRate());
		System.out.println("---------------------");
		hcr = new HolidayCabinRental(4);
		System.out.printf("Weekly Rental Rate for Summer Holiday Cabin is : %.2f", hcr.getWeeklyRentalRate());
		
	}

}
