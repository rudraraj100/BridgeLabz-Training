package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
	
	String type;
	
	
	public FixedDepositAccount(long accountNumber , double balance , String type) {
		
		super(accountNumber , balance);
		this.type = type;	
		
	}

	void displayAccountType() {
		super.displayAccountType();
		System.out.println("This is a FD account");
	}

}
