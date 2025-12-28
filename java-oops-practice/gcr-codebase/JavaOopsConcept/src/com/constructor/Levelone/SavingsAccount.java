package com.constructor.levelone;
// subclass
public class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);  // protected
        System.out.println("Balance        : ₹" + getBalance());  // private via method
        System.out.println("Interest Rate  : " + interestRate + "%");
    }

}
