package com.constructor.levelone;

public class BankAccount {
	
	 public long accountNumber;        // accessible everywhere
	    protected String accountHolder;   // accessible in subclasses
	    private double balance;           // accessible only inside this class

	    // Constructor
	    BankAccount(long accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    // Public method to get balance
	    public double getBalance() {
	        return balance;
	    }

	    // Public method to modify balance (deposit)
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    // Public method to modify balance (withdraw)
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Invalid withdrawal amount");
	        }
	    }

}
