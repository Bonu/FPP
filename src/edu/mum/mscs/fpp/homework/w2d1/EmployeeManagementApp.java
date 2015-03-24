/**
 * EmployeeManagementApp.java
 */
package edu.mum.mscs.fpp.homework.w2d1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 * 2. A university department consists of professors and secretaries. Each professor and each 
 * secretary has a name, a salary, and a hire date. Use inheritance and polymorphism to create 
 * an application that represents the department and its professors and secretaries as objects, 
 * and provides a test class that creates 3 professors and 2 secretaries, and then outputs the 
 * combined total of all of their salaries.
 * 
	Start by creating classes
	Professor
	Secretary
	DeptEmployee
	
	having the following relationship:
	                 |------Secretary
	 DeptEmployee----
	                 |------ Professor
	
	Place instance fields and corresponding accessor/mutator methods in DeptEmployee to represent 
	name and hire date (do not create accessors or mutators for salary). Do not put these fields 
	in either the Professor or Secretary class. Also place in the Professor class an int field 
	numberOfPublications, with corresponding accessor and mutator methods. Place in the Secretary 
	class a double field overtimeHours, also with corresponding accessor and mutator methods.
	
	Place a computeSalary method in DeptEmployee which simply returns the value stored in salary. 
	Override the computeSalary method in Secretary so that the return value is the sum of the value 
	of salary plus 12 times the number of overtime hours.
	 
	Then in the main method of a class named Main, create three instances of  Professor and two 
	instances of Secretary (you can invent the values to pass into the constructor). In each of 
	the Professor instances, set the value of numPublications to 10. And in each of the Secretary 
	instances, set overtimeHours to 200. Finally, create an array of department employees:
	
			DeptEmployee[] department = new DeptEmployee[5]
	
	and then populate the array with the Professor and Secretary instances you have just created. 
	Then ask the user if he wishes to see the sum of all salaries in the department. 
	If the user responds "Y", then loop through the department array and polymorphically read, 
	and sum, all salaries, and output the result to the console.
 *
 *
 *Output:
 *
 *  Professor [name=Alan Turing, salary=40000.0, hireDate=Sat Apr 12 22:22:53 CDT 2003, numberOfPublications=10]
	Professor [name=Stephan Paulicke, salary=28000.0, hireDate=Fri Aug 25 22:22:53 CDT 2006, numberOfPublications=10]
	Professor [name=Timm Roser, salary=55000.0, hireDate=Thu Dec 02 22:22:53 CST 1999, numberOfPublications=10]
	Secretary [name=Mariska Nyoug, salary=22000.0, hireDate=Sat Aug 02 22:22:53 CDT 2003, overtimeHours=200.0]
	Secretary [name=Chig Chu, salary=10000.0, hireDate=Sun Jun 22 22:22:53 CDT 2008, overtimeHours=200.0]
	Do you wish to see the sum of all salaries in the department ? Y/N
	y
	Sum of all salaries in the department : 155000.00
	
 * @author janardhanbonu
 *
 */
public class EmployeeManagementApp {

	public static Calendar cal = new GregorianCalendar();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor("Alan Turing", 40000, extractDate(03,12,2003), 10);
		department[1] = new Professor("Stephan Paulicke", 28000, extractDate(07,25,2006), 10);
		department[2] = new Professor("Timm Roser", 55000,extractDate(11,02,1999), 10);
		department[3] = new Secretary("Mariska Nyoug", 22000, extractDate(07,02,2003), 200);
		department[4] = new Secretary("Chig Chu", 10000, extractDate(05,22,2008), 200);
		
		for (DeptEmployee deptEmployee : department) {
			System.out.println(deptEmployee.toString());
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you wish to see the sum of all salaries in the department ? Y/N");
		
		String yesno = input.next();
		
		if(yesno.equalsIgnoreCase("y")){
			System.out.printf("Sum of all salaries in the department : %.2f",getSumOfEmployeesSalaries(department));
		}

	}
	
	public static double getSumOfEmployeesSalaries(DeptEmployee[] department) {
		
		double total = 0;
		for (DeptEmployee deptEmployee : department) {
			total = total + deptEmployee.salary;
		}
		return total;
	}
	
	public static Date extractDate(int month, int day, int year) {
		cal.set(year, month, day);
		return cal.getTime();
	}
	
}

class DeptEmployee{
	
	protected String name;
	protected double salary;
	protected Date hireDate;
	
	public DeptEmployee(String name, double salary, Date hireDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public double computeSalary(){
		return salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
}

class Professor extends DeptEmployee{
	
	private int numberOfPublications;
	
	public Professor(String name, double salary, Date hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", salary=" + salary + ", hireDate="
				+ hireDate + ", numberOfPublications=" + numberOfPublications
				+ "]";
	}
	
}

class Secretary extends DeptEmployee{
	
	private double overtimeHours;
	
	public Secretary(String name, double salary, Date hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary(){
		return salary + (12 * overtimeHours) ;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public String toString() {
		return "Secretary [name=" + name + ", salary=" + salary + ", hireDate="
				+ hireDate + ", overtimeHours=" + overtimeHours + "]";
	}
	
}


