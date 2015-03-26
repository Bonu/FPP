/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d2;

import java.util.Scanner;

/**
 * 
	1. Create an abstract Insurance class. The Insurance class contains a String representing the 
	type of insurance and a double that holds the monthly price. The Insurance class constructor 
	requires a String argument indicating the type of insurance. The Insurance class contains a 
	get method for each field; it also contains two abstract methods named setCost() and display().
	 
	Health and Life are the two subclasses to display different types of insurance policies and 
	benefits come under Health, Life and the cost per month. The Life class setCost() method sets 
	the monthly fee to $36, and the Health class sets the monthly fee to $196.  
	
	Write a main method class named UseInsurance that prompts the user for the type of insurance to 
	be displayed, and then create the appropriate object.
 *
 *Output:
 *
 *	---Insurance Management System---
	 Please select the insurance type 
	 1. Health Insurance 
	 2. Life Insurance
	1
	InsuranceType : Health Insurance
	 Monthly Price : 196.00
 *
 * @author janardhanbonu
 *
 */

class Life extends Insurance {

	public Life(String insuranceType) {
		super(insuranceType);
		setCost();
	}

	@Override
	public void setCost() {
		this.monthlyPrice = 36;
	}

	@Override
	public void display() {
		System.out.printf("InsuranceType : %s\n Monthly Price : %.2f\n", insuranceType, monthlyPrice);
	}
	
} 
class Health extends Insurance {

	public Health(String insuranceType) {
		super(insuranceType);
		setCost();
	}

	@Override
	public void setCost() {
		this.monthlyPrice = 196;
	}

	@Override
	public void display() {
		System.out.printf("InsuranceType : %s\nMonthly Price : %.2f\n", insuranceType, monthlyPrice);
	}
	
}

abstract class Insurance {
	
	public String insuranceType;
	public double monthlyPrice;
	
	public Insurance(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	public abstract void setCost();
	
	public abstract void display();

	public String getInsuranceType() {
		return insuranceType;
	}

	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	
}

public class UseInsurnace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("---Insurance Management System---\n Please select the insurance type \n 1. Health Insurance \n 2. Life Insurance");
		
		Insurance insurance;
		Scanner input = new Scanner(System.in);
		String str = input.next();
		if(str.equals("1")){
			insurance = new Health("Health Insurance");
			insurance.display();
		} else if(str.equals("2")){
			insurance = new Life("Life Insurance");
			insurance.display();
		} else {
			System.out.println("Invalid insurance type input should be either 1 or 2");
		}
	}

}
