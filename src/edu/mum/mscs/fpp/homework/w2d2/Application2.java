/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d2;

/**
 * 2. Define an interface called Employee that includes constants for the base
 * salary ($10 per hour), for a bonus ($2 per hour) and for extra hours ($15 per
 * hour). Also, include in the interface the definition of a method for getting
 * the information of the employee(determine the necessary fields by your own)
 * and other one for calculating the monthly salary return double value.
 * 
 * Define two classes: Secretary and Manager, which implement the interface
 * Employee. Since all employees must receive a salary, the interface Employee
 * has a definition for a method that calculates it. But because the salaries of
 * different kinds of employees are obtained in different ways, each class has
 * its own implementation.
 * 
 * The class Secretary should have data members for number of hours per month
 * and number of years of work. The secretaries cannot work extra hours, but if
 * they have worked more than 5 years, they get an extra 10% of the monthly
 * salary, and if they work more than 150 hours per month, they get a bonus for
 * each hour after 150.
 * 
 * The class Manager should have the same data members (number of hours per
 * month and number of years of work) and a data member for extra hours. The
 * monthly salary of a manager is the base salary multiplied by 2 times the
 * number of hours per month, plus if they work more than 150 hours per month,
 * they get extra hours money for each hour after 150.
 * 
 * In your main method declare an instance for Secretary and another one for
 * Manager. Ask the user for the values of each object and calculate the monthly
 * salary of each one.
 * 
 * @author janardhanbonu
 *
 */

interface Employee {

	public static final int baseSalaryPerHour = 10;
	public static final int bonusPerHour = 2;
	public static final int extraHour = 15;

	public void getEmployeeInformation();
	public double calcMonthlySalary();

}

class Secretary implements Employee {

	public int nHoursMonth;
	public int noOfYearsWork;
	public String name;
	public int age;
	public double salary;
	
	public int getnHoursMonth() {
		return nHoursMonth;
	}

	public void setnHoursMonth(int nHoursMonth) {
		this.nHoursMonth = nHoursMonth;
	}

	public int getNoOfYearsWork() {
		return noOfYearsWork;
	}

	public void setNoOfYearsWork(int noOfYearsWork) {
		this.noOfYearsWork = noOfYearsWork;
	}

	@Override
	public void getEmployeeInformation() {

	}

	/**
	 * The secretaries cannot work extra hours, but if they have worked more
	 * than 5 years, they get an extra 10% of the monthly salary, and if they
	 * work more than 150 hours per month, they get a bonus for each hour after
	 * 150.
	 */
	@Override
	public double calcMonthlySalary() {
		int totalSalary = 0;
		if (noOfYearsWork > 5) {
//			totalSalary = 
		}
		return 0;
	}

}

class Manager implements Employee {

	@Override
	public void getEmployeeInformation() {

	}

	@Override
	public double calcMonthlySalary() {
		return 0;
	}

}

public class Application2 {

	public Application2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
