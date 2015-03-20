/**
 *  LoanCalculator.java 
 */
package com.mum.mscs.fpp.homework.w1d3;

/**
 * 
 * 3.   Develop a LoanCalculator class, which perform the following.
		a.	Instance variables are loan_amount, interest_rate, loan_period.
		b.	Implement a method to calculate MothlyPayment 
		c.	Implement a method to calculate YearlyPayment.
		d.	Create an array of 4 objects for this class.
		e.	Display the output as follows. (Payment upto 2 decimals)

         Loan	          Annual	       Loan Period           Monthly		        Total
         Amount	     Interest Rate      (years)              Interest              Interest                         

         Apply simple interest formula, Interest = (loan_amount *  loan_period * interest_rate)/100
         
    output:
		    Loan 	Annual 	LoanPeriod 	Monthly 	Yearly
			50000	 5.00	 4		     833.33		 10000.00
			Loan 	Annual 	LoanPeriod 	Monthly 	Yearly
			10000	 2.15	 6		     107.50		 1290.00
			Loan 	Annual 	LoanPeriod 	Monthly 	Yearly
			28000	 15.00	 1		     350.00		 4200.00
			Loan 	Annual 	LoanPeriod 	Monthly 	Yearly
			100000	 1.50	 2		 2   50.00		 3000.00
         
*/
public class LoanCalculator {
	
	private int loan_amount;
	private float interest_rate;
	private int loan_period;
	private float total_amount;
	
	public LoanCalculator(int loan_amount, float interest_rate,
			int loan_period) {
		super();
		this.loan_amount = loan_amount;
		this.interest_rate = interest_rate;
		this.loan_period = loan_period;
	}
	
	public float monthlyInterest() {
		return ((loan_amount * interest_rate * loan_period)/(12*100));
	}
	
	public float yearlyInterest() {
		return (loan_amount * interest_rate * loan_period)/100;
	}
	
	public void displayDetails() {
		System.out.printf("Loan \tAnnual \tLoanPeriod \tMonthly \tYearly\n");
		System.out.printf("%d\t %.2f\t %d\t\t %.2f\t\t %.2f\n",loan_amount,interest_rate,loan_period,monthlyInterest(),yearlyInterest());
	}
	
	public static void main(String[] args) {
		LoanCalculator[] lc = new LoanCalculator[4];
		lc[0] = new LoanCalculator(50000,5.00f,4);
		lc[0].displayDetails();
		lc[1] = new LoanCalculator(10000,2.15f,6);
		lc[1].displayDetails();
		lc[2] = new LoanCalculator(28000,15.00f,1);
		lc[2].displayDetails();
		lc[3] = new LoanCalculator(100000,1.50f,2);
		lc[3].displayDetails();
	}
	
	public float getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public float getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}
	public int getLoan_period() {
		return loan_period;
	}
	public void setLoan_period(int loan_period) {
		this.loan_period = loan_period;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	
	

}