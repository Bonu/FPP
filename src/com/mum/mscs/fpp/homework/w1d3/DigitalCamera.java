/**
 * DigitalCamera.java
 */
package com.mum.mscs.fpp.homework.w1d3;

/**
 *
 * 
 * 2.a	Create a class for EBay’s Camera Store, which is having a digital camera sale. 
 * The class is named as DigitalCamera, and it contains data fields for a brand, the 
 * number of megapixels in the resolution, and price. Include a constructor that takes 
 * arguments for the brand and megapixels. If the megapixel parameter is greater than 10, 
 * the constructor sets it to 10. The sale price is set based on the resolution; any 
 * camera with 6 megapixels or fewer is $99, and all other cameras are $129. Also include 
 * a method that displays DigitalCamera details. 
 * 
 * This class is tested in TestDigitalCamera.java
 * 
 */
public class DigitalCamera {

	 private String brand;
	 private int resolution;
	 private int price;
	
	public DigitalCamera(String brand, int resolution) {
		super();
		this.brand = brand;
		this.resolution = resolution;
		if(resolution > 10){
			setResolution(10);
			setPrice(129);
		} else if( resolution > 6){
			setPrice(129);
		} else {
			setPrice(99);
		}
	}
	
	public void dispalyCameraDetails() {
		System.out.printf("Brand : %s \t Resolution : %d \tPrice : %d \n", brand, resolution, price);
	}
	
	@Override
	public String toString() {
		return "DigitalCamera [Brand =" + getBrand() + ", Resolution ="
				+ getResolution() + ", Price=" + getPrice() + "]";
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	 
}


