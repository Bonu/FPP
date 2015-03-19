/**
 * 
 */
package com.mum.mscs.fpp.homework.w1d3;

/**
 * 1.	Implement the Java code for the given class diagram.
		Account
		+balance : double
		+double : getBalance()
		+int credit()
		+int debit() 
		
		In the above class diagram the methods credit() and debit() return -1 
		for the negative or zero input and also display the information as 
		“Invalid credit/debit amount” else return 1.
		
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
		System.out.println("Balance Amount:"+balance);
		return balance;
	}
	
	public short credit(){
		return checkBalance("Credit");
	}
	
	public short debit() {
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
			return 1;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acnt1 = new Account(0l);
		acnt1.debit();
		acnt1.getBalance();
		
		
		Account acnt2 = new Account(100l);
		acnt2.credit();
		acnt2.getBalance();
		
	}
	
	
}
