package com.encapsulation.bankingsystem;

//Current account with minimal interest and limited loan eligibility
public class CurrentAccount extends BankAccount implements Loanable {

 public CurrentAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 // Interest calculation for current account
 @Override
 public double calculateInterest() {
     return balance * 0.01; // 1% interest
 }

 // Apply for loan
 @Override
 public void applyForLoan() {
     System.out.println("Loan application submitted for Current Account");
 }

 // Loan eligibility based on balance
 @Override
 public double calculateLoanEligibility() {
     return balance * 3;
 }
}
