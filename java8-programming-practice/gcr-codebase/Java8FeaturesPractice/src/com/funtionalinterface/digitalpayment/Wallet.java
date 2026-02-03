package com.funtionalinterface.digitalpayment;

public class Wallet implements Payment{
	
	private double balance;
	
	public Wallet(double balance) {
		this.balance = balance;
	}

	@Override
	public void pay(double cost) {
		
		if(balance >= cost) {
			System.out.println("+ You payed: " + cost + " | " + (balance - cost) + " are left in your wallet");
			balance -= cost;
		}
		else {System.out.println("You dont have enough cash");}		
	}

	public double getBalance() {
		return balance;
	}
	

}
