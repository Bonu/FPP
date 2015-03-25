/**
 * GeometricApp.java
 */
package edu.mum.mscs.fpp.homework.w2d1;

/**
 * 3.1	Develop a code for the given class diagram
 * Code for the toString() Method in GeometricObject.
	public String toString()
	 {
	 return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	 }
	
	Develop a main method class to create the objects and to access the methods. To display object values in your main class to call the toString() method, write the following line of code.
	System.out.println(objectname).
	
	Perimeter of a circle = 2 * Math.PI * radius
	Diameter of a circle = 2 * radius
	Area of Rectangle = width * height
	Perimeter of a Rectangle = 2( height + weight)

 * 
 * output: 
 * 
 * Created on :Tue Mar 24 14:01:56 CDT 2015
	 Color: RED 
	 Filled :true
	Created on :Tue Mar 24 14:01:56 CDT 2015
	 Color: GREEN 
	 Filled :false
	

 * @author 984417
 *
 */
public class GeometricApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject geo = new Cirlce(2.23,"RED",true);
		System.out.println(geo);
		
		geo = new Rectangle(2, 4, "GREEN", false);
		System.out.println(geo);
	}

}
