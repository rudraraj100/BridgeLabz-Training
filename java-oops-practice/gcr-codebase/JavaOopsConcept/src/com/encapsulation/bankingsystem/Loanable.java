package com.encapsulation.bankingsystem;

//Interface for accounts eligible for loans
public interface Loanable {

 // Apply for a loan
 void applyForLoan();

 // Calculate loan eligibility amount
 double calculateLoanEligibility();
}

