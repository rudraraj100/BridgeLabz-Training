package com.encapsulation.bankingsystem;

//Abstract base class for all bank accounts
public abstract class BankAccount {

 // Encapsulated fields
 private String accountNumber;
 private String holderName;
 protected double balance; // accessible to subclasses

 // Constructor
 public BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 // Deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 // Withdraw money with balance check
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
     }
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Abstract method for interest calculation
 public abstract double calculateInterest();
}
