/**
 * 
 */
package edu.mum.mscs.fpp.homework.w1d4;

/**
 * 2. Create a class called employee with the attributes firstname, lastname, 
 * address,salary, and empid. Create a static method to set the unique 
 * empid(auto generation). Create an array of objects for the employee class. 
 * Write a method to display the employee information. Find which employee 
 * is getting high salary.
 * 
 * @author janardhanbonu
 *
 */

public class EmployeeInformation {
	
	public static void main(String args[]) {
		
		Employee[] emps = new Employee[5];
		emps[0] = new Employee("Shah", "Ranjan", "Bombay", 10000);
		emps[1] = new Employee("Rao", "Srinivas", "Hyderabad", 12000);
		emps[2] = new Employee("Iyer", "Raghav", "Chennai", 18000);
		emps[3] = new Employee("Singh", "Mreenal", "Amritsar", 9000);
		emps[3].displayEmp();
		emps[4] = new Employee("Maria", "Rita", "London", 22000);
		emps[4].displayEmp();
		
	}
	
	public Employee highestSalaryEmp(Employee[] emps){
		//TODO - find highest value in the array using recursion
		return null;
	}
	
}

class Employee {
	
	private String lastName;
	private String firstName;
	private String address;
	private int salary;
	private int empId;

	private static int EMP_ID_AUTO=1000;
	
	public Employee(String lastName, String firstName, String address,
			int salary) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.salary = salary;
		this.empId = getAutoEmpId();
		
	}

	public static int getAutoEmpId(){
		return EMP_ID_AUTO++;
	}
	
	public void displayEmp(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Employee [lastName=" + lastName + ", firstName=" + firstName
				+ ", address=" + address + ", salary=" + salary + ", empId="
				+ empId + "]";
	}

}
