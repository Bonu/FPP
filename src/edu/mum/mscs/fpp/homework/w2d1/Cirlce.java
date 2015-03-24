/**
 * Circle.java
 */
package edu.mum.mscs.fpp.homework.w2d1;

/**
 * @author janardhanbonu
 *
 */
public class Cirlce extends GeometricObject {

	private double radius;
	
	/**
	 * 
	 */
	public Cirlce() {
		// TODO Auto-generated constructor stub
	}

	public Cirlce(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * @param color
	 * @param filled
	 */
	public Cirlce(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getArea(){
		return Math.PI * (radius * radius);
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public double getDiameter(){
		return radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


		

}
