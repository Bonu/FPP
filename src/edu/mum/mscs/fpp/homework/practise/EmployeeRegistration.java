/**
 *     Topics discussed
 *                     
		Static Fields
		Static Methods
		Call By Reference 
		Call By Value
		Overloading method and constructor                
		Packages in Java
		Invoking constructor inside a constructor
		Enumerated type 
		Final Instance Fields = Constants
 */

package edu.mum.mscs.fpp.homework.practise;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

enum EmployeeType {
	ENGINEER, HR, CEO
};

enum Gender {
	MALE, FEMALE
};

public class EmployeeRegistration {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MicroAppleCompany company = new MicroAppleCompany();
		Employee newEmp1 = company.addEmployee("Lisa Maron", Gender.FEMALE, 02, 25, 1987, 5000, "MBA");
		company.assingPositioToEmp(newEmp1);
		newEmp1.displayEmpInfo();
		
		
		Employee newEmp2 = company.addEmployee("Mariska Shah", Gender.FEMALE, 02, 12, 1985, 6000, "MBA");
		company.assingPositioToEmp(newEmp2);
		newEmp2.displayEmpInfo();
		System.out.println("Total amount with bonus for Salary 10000 is "+company.calcBonusForAmount(10000));
		
		/* Constant variable call */
		System.out.println("Name of the Company : "+ MicroAppleCompany.MY_COMPANY_NAME);
		
		/* Static method call */
		System.out.println("Number of Employees :"+ MicroAppleCompany.getNumberOfEmployees());
		
		
	}
	
}

/** 
 * Base Class
 * 
 */
class Company {

	/** Static field */
	public static int numberOfEmployees;

	Employee emps[];
	
	/** Static method */
	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}
}

/**
 *  
 * 
 */
class MicroAppleCompany extends Company {

	/** Constant */
	public static final String MY_COMPANY_NAME = "MICRO APPLE SOFTWARE LTD";
	
	private int maxEmployees = 100;
	private int bonusPercent = 12;
	
	/**
	 * Default constructor
	 */
	public MicroAppleCompany() {
		emps = new Employee[maxEmployees];
		createCompany();
	}

	/** Call by Value */
	public int calcBonusForAmount(int amount){
		return amount + (amount * bonusPercent)/100;
	}
	
	/** Call by Reference */
	public void assingPositioToEmp(Employee emp) {
		if (emp.getEdu().equals("BTECH")) {
			emp.setPosition(EmployeeType.ENGINEER);
		} else if (emp.getEdu().equals("MBA")) {
			emp.setPosition(EmployeeType.HR);
		}
	}
	
	public Employee addEmployee(String name, Gender gender, int dob_month, int dob_day, int dob_year, int salary, String edu) {
		emps[numberOfEmployees] = new Employee(name,gender,dob_month, dob_day, dob_year, salary, edu);
		emps[numberOfEmployees].setEmpId(numberOfEmployees);
		numberOfEmployees++;
		return emps[numberOfEmployees-1];
	}

	public void createCompany() {
			emps[0] = new Employee("CE0_1", Gender.MALE, 07, 12, 1972, 4000);
			emps[0].setPosition(EmployeeType.CEO);
			numberOfEmployees++;
			importExistingEmployees();
	}

	public void importExistingEmployees() {
		addEmployee("panchen", Gender.MALE, 07, 12, 1972, 4000, "BTECH");
		addEmployee("jackychen", Gender.MALE, 07, 12, 1972, 4000, "BTECH");
		addEmployee("michalejackson", Gender.MALE, 07, 12, 1972, 4000, "MBA");
	}

}

/** 
 *  
 */

class Employee {

	private final String name;
	private int age = 0;
	private int salary;
	private Gender gender;
	private final Date dob;
	private String edu="NOTHING";
	private EmployeeType position;
	private int empId=0;

	Calendar cal = new GregorianCalendar();

	/** Parameterized constructor overloaded */
	public Employee(String name, Gender gender, int dob_mont, int dob_day, int dob_year,
			int salary) {
		this.name = name;
		this.gender = gender;
		cal.set(dob_year, dob_mont, dob_day);
		this.dob = cal.getTime();
		this.salary = salary;
		if(age == 0 ) calcAge();
	}

	public Employee(String name, Gender gender, int dob_mont, int dob_day, int dob_year,
			int salary, String edu) {
		/* Constructor call inside a constructor */
		this(name, gender,dob_mont, dob_day, dob_year, salary);
		this.edu = edu;
	}

	public Employee(String name, Gender gender, int dob_mont, int dob_day, int dob_year,
			int salary, String edu, int age) {
		this(name, gender,dob_mont, dob_day, dob_year, salary,edu);
		this.age = age;
	}
	
	public void calcAge() {
		Calendar now = new GregorianCalendar();
		Calendar dobs = new GregorianCalendar();
		dobs.setTime(dob);
		this.age = now.get(Calendar.YEAR) - dobs.get(Calendar.YEAR);
	}
	
	public void displayEmpInfo(){
		System.out.printf("\n---------Employee Details---------\n"
				+ "Employee Id : %d\n"
				+ "Name : %s\n"
				+ "Gender :%s\n"
				+ "Age  : %d\n"
				+ "Position : %s\n"
				+ "DOB  : %s\n"
				+ "Salary : %d\n"
				+ "Education :%s\n",
				empId, name, gender.name(), age, position.name(), dob.toString(), salary, edu);
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getEdu() {
		return edu;
	}

	public EmployeeType getPosition() {
		return position;
	}

	public void setPosition(EmployeeType position) {
		this.position = position;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
