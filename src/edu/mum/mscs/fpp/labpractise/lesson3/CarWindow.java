/**
 * 
 */
package edu.mum.mscs.fpp.labpractise.lesson3;

/**
 * 3.	Class CarWindow: This class should describe the Windows in a car in terms of how 
 * many windows a car has and the width and the height of a window (assuming all windows 
 * have the same dimension) The class needs to define a non-default constructor that accepts 
 * values for the three attributes and assign them to corresponding class data members. 
 * The class should also define three methods, rollUp(), rollDown(), and ComputerWindowArea(). 
 * Both the rollUp() and rollDown() method will just display appropriate messages on the screen
 *  when called. The ComputerWindowArea() will compute the area of a window (assuming it is a 
 *  rectangle) and returning the area value to the caller. 
 *  
 * @author 984417
 *
 */
public class CarWindow {
	
	private int numberOfwindows;
	private int windowHeight;
	private int windowWidth;
	
	public CarWindow(int numberOfwindows, int windowHeight, int windowWidth) {
		super();
		this.numberOfwindows = numberOfwindows;
		this.windowHeight = windowHeight;
		this.windowWidth = windowWidth;
	}

	public void rollUp() {
		System.out.println("Window rolling up ...");
	}
	
	public void rollDown(){
		System.out.println("Window rolling down ...");
	}
	
	public int computerWindowArea(){
		return (windowHeight * windowWidth);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarWindow cw = new CarWindow(4, 20,30);
		cw.rollUp();
		cw.rollDown();
		System.out.println("Window Area :"+cw.computerWindowArea());
	}
	
	

}
