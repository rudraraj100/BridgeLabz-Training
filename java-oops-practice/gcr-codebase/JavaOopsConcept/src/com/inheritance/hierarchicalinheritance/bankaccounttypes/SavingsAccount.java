package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {
	
	float interestRate;
	
	public SavingsAccount(long accountNumber , double balance , float interestRate ) {
		super(accountNumber , balance );
		this.interestRate = interestRate;
			
	}
	
	void displayAccountType() {
		System.out.println("\nThis is a saving account");
		super.displayAccountType();
		System.out.println("Interest rate: " + interestRate);
	}
}
