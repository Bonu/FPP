/**
 * 
 */
package com.mum.mscs.fpp.labpractise.lesson3;

/**
 * @author 984417
 *
 */
public class PhoneNumber {

	private String firstName = "Abdul";
	private String lastName = "Kalam";
	private String phoneNumber = "213 290 6424";
	
	
	/**
	 * 
	 */
	public PhoneNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneNumber ph = new PhoneNumber();
		ph.getContact();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "contact = \"" + getFirstName()
				+ ", " + getLastName() + ", "
				+ getPhoneNumber()+"\"" ;
	}

	public void getContact(){
		System.out.println(this.toString());
	}

}
