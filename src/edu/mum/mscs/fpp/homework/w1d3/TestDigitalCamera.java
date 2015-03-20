/**
 * 
 */
package edu.mum.mscs.fpp.homework.w1d3;

/**
 * 2.b Write an application named TestDigitalCamera 
 * in which you instantiate at least four objects, prompt the user for values for the 
 * camera brand and number of megapixels, and display all the values.
 * 
 * output:
 *  Brand : Canon 	 Resolution : 10 	Price : 129 
	Brand : Nikon 	 Resolution : 10 	Price : 129 
	Brand : Olympus 	 Resolution : 6 	Price : 99 
	Brand : Sony 	 Resolution : 4 	Price : 99 
 * 
 * @author janardhanbonu
 *
 */
public class TestDigitalCamera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DigitalCamera dc1 = new DigitalCamera("Canon", 24);
		dc1.dispalyCameraDetails();
		
		DigitalCamera dc2 = new DigitalCamera("Nikon", 12);
		dc2.dispalyCameraDetails();
		
		DigitalCamera dc3 = new DigitalCamera("Olympus", 6);
		dc3.dispalyCameraDetails();
		
		DigitalCamera dc4 = new DigitalCamera("Sony", 4);
		dc4.dispalyCameraDetails();
		
	}

}
