/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d1;

import java.util.Date;

/**
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
		return new Date();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled
				+ ", dateCreated=" + getDateCreated() + "]";
	}

}
