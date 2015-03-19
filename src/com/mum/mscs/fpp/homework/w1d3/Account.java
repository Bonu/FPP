/**
 * 
 */
package com.mum.mscs.fpp.homework.w1d3;

/**
 * 1.	Implement the Java code for the given class diagram.
		Account
		+balance : double
		+double : getBalance()
		+int credit(amount)
		+int debit(amount) 
		
		In the above class diagram the methods credit() and debit() return -1 
		for the negative or zero input and also display the information as 
		Invalid credit/debit amount
		
		output:
		Invalid Debit amount
		Balance Amount:0.0
		Balance Amount:100.0
		
		@author janardhanbonu
 */
 public class Account {
	
	public Account(double balance){
		this.balance = balance;
	}
	
	public double balance;
	
	public double getBalance(){
		System.out.printf("Balance Amount: %.2f\n",balance);
		return balance;
	}
	
	public short credit(double amount){
		this.balance = this.balance - amount;
		return checkBalance("Credit");
	}
	
	public short debit(double amount) {
		this.balance = this.balance + amount;
		return checkBalance("Debit");
	}
	
	public short checkBalance(String transactionType){
		
		if(balance < 0){
			System.out.printf("Invalid %s amount\n", transactionType);
			return -1;
		} else if (balance ==0){
			System.out.printf("Invalid %s amount\n", transactionType);
			return 0;
		} else {
			System.out.printf("Amount %sed\n", transactionType);
			return 1;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acnt1 = new Account(20000);
		acnt1.debit(1000);
		acnt1.getBalance();
		
		Account acnt2 = new Account(1000);
		acnt2.credit(1000);
		acnt2.getBalance();
		
	}
	
	
}
