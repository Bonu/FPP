/**
 * 
 */
package edu.mum.mscs.fpp.homework.w3d5;

/**
 * 4. Create a class called CustomerAccount with the following attributes and methods.
	Attributes : Cus_name, Acc_No, Balance.
	Functions : deposit() – Used to increase the balance
	            Withdraw() – Used to reduce the balance. 
	Create a user defined exception to handle the following situation
	1.	Withdraw amount exceed the balance
	2.	Balance reach below 100$.
	
	Output:
	CustomerAccountApp [customerName=Mickel, accountNumber=20987, balance=100.0]
	Withdraw 200: Negative Balancejava.lang.IllegalArgumentException
	
	Deposit 300: 
	CustomerAccountApp [customerName=Mickel, accountNumber=20987, balance=400.0]
	Withdraw 200: 
	Withdraw 200 result: 
	CustomerAccountApp [customerName=Mickel, accountNumber=20987, balance=200.0]
	Withdraw 100: 
	Withdraw 100 result: 
	CustomerAccountApp [customerName=Mickel, accountNumber=20987, balance=200.0]
	CustomerAccountApp [customerName=Mickel, accountNumber=20987, balance=200.0]
	Negative Balancejava.lang.IllegalArgumentException

 * @author janardhanbonu
 *
 */
public class CustomerAccountApp {
	private String customerName;
	private int accountNumber;
	private double balance;
	
	public CustomerAccountApp(String customerName, int accountNumber,
			double balance) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "CustomerAccountApp [customerName=" + customerName
				+ ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}


	public static void main(String[] args){
		CustomerAccountApp ca = new CustomerAccountApp("Mickel", 20987, 100);
		System.out.println(ca);
		System.out.println("Withdraw 200: ");
		ca.withdraw(200);
		System.out.println("Deposit 300: ");
		ca.deposit(300);
		System.out.println(ca);
		System.out.println("Withdraw 200: ");
		ca.withdraw(200);
		System.out.println("Withdraw 200 result: \n"+ca);
		System.out.println("Withdraw 100: ");
		ca.withdraw(110);
		System.out.println("Withdraw 100 result: \n"+ca);
		System.out.println(ca.toString());
	}
	
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount){
		try{
			if(balance <= 100 || balance < amount || (balance-amount) < 100){
				throw new IllegalArgumentException();
			}else{
				balance -= amount;
			}
		}catch(IllegalArgumentException e){
			System.err.println("Negative Balance"+e);
		}
	}
}

