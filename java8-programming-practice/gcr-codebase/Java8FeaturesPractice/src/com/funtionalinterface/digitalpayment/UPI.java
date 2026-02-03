package com.funtionalinterface.digitalpayment;

public class UPI implements Payment {
	
private double balance;
	
	public UPI(double balance) {
		this.balance = balance;
	}

	@Override
	public void pay(double cost) {
		
		if(balance >= cost) {
			System.out.println("+ You payed: " + cost + " | " + (balance - cost) + " are left in your account");
			balance -= cost;
		}
		else {System.out.println("You dont have enough balance");}		
	}

	public double getBalance() {
		return balance;
	}
}

