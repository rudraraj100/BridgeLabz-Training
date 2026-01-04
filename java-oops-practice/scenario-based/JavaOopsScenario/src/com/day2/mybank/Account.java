package com.day2.mybank;

abstract class Account implements ITransaction {
    protected String accountNumber;   // accessible to subclasses
    private double balance;            // sensitive data

    // Constructor with opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Polymorphic method
    public abstract void calculateInterest();

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance ❌");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
