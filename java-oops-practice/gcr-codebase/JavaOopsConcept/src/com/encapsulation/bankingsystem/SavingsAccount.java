package com.encapsulation.bankingsystem;

//Savings account with interest and loan facility
public class SavingsAccount extends BankAccount implements Loanable {

 public SavingsAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 // Interest calculation for savings account
 @Override
 public double calculateInterest() {
     return balance * 0.04; // 4% interest
 }

 // Apply for loan
 @Override
 public void applyForLoan() {
     System.out.println("Loan application submitted for Savings Account");
 }

 // Loan eligibility based on balance
 @Override
 public double calculateLoanEligibility() {
     return balance * 5;
 }
}

