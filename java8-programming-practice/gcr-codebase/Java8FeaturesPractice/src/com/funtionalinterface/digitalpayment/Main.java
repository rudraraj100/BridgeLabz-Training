package com.funtionalinterface.digitalpayment;

// Scenario: UPI, Credit Card, Wallet all must implement pay() method.
// ○ Task: Define and implement.

public class Main {

	public static void main(String[] args) {
		
		
		Wallet w = new Wallet(15000);
		
		w.pay(5000);
		
		UPI u = new UPI(1500);
		
		u.pay(500);
		
		CreditCard cc = new CreditCard(30000);
		
		cc.pay(25000);


	}

}
