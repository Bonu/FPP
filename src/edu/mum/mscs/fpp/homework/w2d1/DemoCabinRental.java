/**
 * DemoCabinRental.java
 */
package edu.mum.mscs.fpp.homework.w2d1;

/**
 * 
 * 1.1 Every summer, Leeland Lakeside resort rents cabins by the week. 
 *  Create a class named CabinRental that includes an integer field for 
 *  the cabin number and a double field for the weekly rental rate.
 *  Include get methods for these fields and a constructor that requires
 *  an integer argument representing the cabin number. The constructor
 *  sets the weekly rate based on the cabin number; cabins numbered 1, 2,
 *  and 3 are $950 per week, and others are $1,100 per week. Create an 
 *  extended class named HolidayCabinRental that is used for rentals during 
 *  weeks that include summer holiday weekends. The constructor for this 
 *  class requires a room number and adds a $150 surcharge to the regular
 *  rental rate. Write a Java file named DemoCabinRental that creates an 
 *  object of each class, and demonstrate that all the methods work correctly. 
 *  Save the files as CabinRental.java, HolidayCabinRental.java, 
 *  and DemoCabinRental.java.
 *    
 *    Related Classes:
 *    CabinRental.java
 *    HolidayCabinRental.java
 *    
 * @author 984417
 *
 */


class CabinRental {
	
	private int cabinNumber;
	private double weeklyRentalRate;
	
	
	public CabinRental(int cabinNumber) {
		super();
		this.cabinNumber = cabinNumber;
		calcWeeklyRate();
	}
	
	public void calcWeeklyRate(){
		if(cabinNumber > 0 && cabinNumber <= 3) {
			weeklyRentalRate = 950;
		} else {
			weeklyRentalRate = 1100;
		}
	}
	
	public int getCabinNumber() {
		return cabinNumber;
	}
	public double getWeeklyRentalRate() {
		return weeklyRentalRate;
	}
	
	
}

class HolidayCabinRental extends CabinRental {
	
}

public class DemoCabinRental {

	public static void main(String[] args) {
		
		
	}

}
