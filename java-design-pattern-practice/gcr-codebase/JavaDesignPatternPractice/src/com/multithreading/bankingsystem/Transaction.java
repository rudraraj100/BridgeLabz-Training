package com.multithreading.bankingsystem;

import java.time.LocalTime;

public class Transaction implements Runnable {
	
	private BankAccount bankAccount;
	private String customerName; 
	private Double amount; 
	private LocalTime timeStamp;
	
	public Transaction(BankAccount bankAccount , String customerName, Double amount) {
		this.customerName = customerName;
		this.amount = amount;
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		
		synchronized(bankAccount) {
			
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " is attempting to withdraw " + amount);
				timeStamp = LocalTime.now();
				if(amount <= bankAccount.getBalance()) {
					double balance = bankAccount.getBalance() - amount;
					bankAccount.setBalance(balance);
					System.out.println(timeStamp + ":  Transaction successful: " + customerName + ": Amount: " + amount + " withdrawed, Balance: " + bankAccount.getBalance());
				}else {
					System.out.println(Thread.currentThread().getName() + " failed ");
				}
				
			}catch(Exception e) {
				System.out.println(e);;
			}
		}
		
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public Double getAmount() {
		return amount;
	}

	public LocalTime getTimestamp() {
		return timeStamp;
	}

	
}
