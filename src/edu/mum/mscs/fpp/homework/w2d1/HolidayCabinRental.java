package edu.mum.mscs.fpp.homework.w2d1;

/**
 * 1.2 Create an 
 *  extended class named HolidayCabinRental that is used for rentals during 
 *  weeks that include summer holiday weekends. The constructor for this 
 *  class requires a room number and adds a $150 surcharge to the regular
 *  rental rate. 
 *  
 *  
 * @author janardhanbonu
 *
 */
class HolidayCabinRental extends CabinRental {
	
	private final int surcharge = 150;

	public HolidayCabinRental(int cabinNumber) {
		super(cabinNumber);
		System.out.println("HolidayCabinRental Constructor invoked");
		addSurCharges();
	}
	
	public void addSurCharges(){
		weeklyRentalRate = weeklyRentalRate + surcharge;
		System.out.println("Surcharges added to Weekly Rentral Rate");
	}
	
}
