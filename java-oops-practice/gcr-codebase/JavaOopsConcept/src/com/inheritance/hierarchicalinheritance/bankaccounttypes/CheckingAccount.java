package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {
	
	double withdrawalLimit;
	
	public CheckingAccount(long accountNumber , double balance , double withdrawalLimit ) {
		
		super(accountNumber , balance );
		this.withdrawalLimit = withdrawalLimit;
		
	}
	
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("withdrawalLimit: " + withdrawalLimit);
	}

}
