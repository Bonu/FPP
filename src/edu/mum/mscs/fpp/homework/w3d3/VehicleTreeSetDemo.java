package edu.mum.mscs.fpp.homework.w3d3;

import java.util.TreeSet;

/**
 * 2.	Create a class Vehicle with Vehiclename, Vehicleprice and Model . 
 * Implement constructor to initialize values. Create TreeSet for the type 
 * Vehicle. Implement Comparable Interface to arrange the items according 
 * to Vechiclename.
 * 
 * Output:
 * 
 * [
Vehicle [name=BMW, price=340000.0, model=BMW 525 di], 
Vehicle [name=Ferrai, price=120000.0, model=Honda], 
Vehicle [name=Land Rover, price=78000.0, model=Rover], 
Vehicle [name=Mercedes, price=200000.0, model=Mercides 15], 
Vehicle [name=Toyota, price=98000.0, model=Toyota Corola]]

 * 
 * @author janardhanbonu
 *
 */
public class VehicleTreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Vehicle> ts = new TreeSet<Vehicle>();
		
		ts.add(new Vehicle("Ferrai", 120000, "Honda"));
		ts.add(new Vehicle("Mercedes", 200000, "Mercides 15"));
		ts.add(new Vehicle("BMW", 340000, "BMW 525 di"));
		ts.add(new Vehicle("Toyota", 98000, "Toyota Corola"));
		ts.add(new Vehicle("Land Rover", 78000, "Rover"));
		System.out.println(ts);

	}

}

class Vehicle implements Comparable<Vehicle>{
	private String name;
	private double price;
	private String model;
	
	public Vehicle(String name, double price, String model){
		this.name = name;
		this.price = price;
		this.model = model;
	}
	
	public int compareTo(Vehicle vobj){
		if (vobj==null)
			return 0;
		if (vobj.getClass() != this.getClass())
			return 0;
		Vehicle vehicle = (Vehicle)vobj;
		return this.name.compareTo(vehicle.name);
	}

	@Override
	public String toString() {
		return "\nVehicle [name=" + name + ", price=" + price + ", model="
				+ model + "]";
	}
	
	
}

