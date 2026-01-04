package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount fd = new FixedDepositAccount(159357 , 120000 , "FD");
		
		fd.displayAccountType();
		
		BankAccount sa = new SavingsAccount(159753 , 120000 , 10);

		sa.displayAccountType();
	}

}
