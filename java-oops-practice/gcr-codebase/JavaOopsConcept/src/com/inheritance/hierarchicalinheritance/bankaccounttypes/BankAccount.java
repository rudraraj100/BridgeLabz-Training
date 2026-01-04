package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
	
	long accountNumber;
	double balance;
	
	public BankAccount(long accountNumber , double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void displayAccountType() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Total Balance: " + balance);
	}
}
