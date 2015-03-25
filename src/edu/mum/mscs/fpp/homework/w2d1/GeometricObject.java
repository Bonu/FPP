/**
 * GeometricObject.java
 */
package edu.mum.mscs.fpp.homework.w2d1;

import java.util.Date;

/**
 * 
 * 3.2 
 *  
 * @author janardhanbonu
 *
 */
public class GeometricObject {

	private String color = "WHITE";
	private boolean filled = false;
	private Date dateCreated;
	
	/**
	 * 
	 */
	public GeometricObject() {
		
	}

	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return  "Created on :"+ getDateCreated() + "\n Color: "+ color + " \n Filled :"+ filled;
	 }


}
