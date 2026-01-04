package com.encapsulation.bankingsystem;

import java.util.*;

//Main class to demonstrate polymorphism
public class BankingSystem {

 public static void main(String[] args) {

     List<BankAccount> accounts = new ArrayList<>();

     accounts.add(new SavingsAccount("SB101", "Ravi", 50000));
     accounts.add(new CurrentAccount("CA202", "Anita", 100000));

     // Polymorphic processing of accounts
     for (BankAccount account : accounts) {

         double interest = account.calculateInterest();

         System.out.println("Account Balance: ₹" + account.getBalance());
         System.out.println("Interest Earned: ₹" + interest);

         if (account instanceof Loanable) {
             ((Loanable) account).applyForLoan();
             System.out.println(
                 "Loan Eligibility: ₹" +
                 ((Loanable) account).calculateLoanEligibility()
             );
         }

         System.out.println("--------------------------------");
     }
 }
}
