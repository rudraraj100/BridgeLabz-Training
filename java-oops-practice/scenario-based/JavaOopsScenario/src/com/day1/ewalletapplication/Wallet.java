package com.day1.ewalletapplication;

abstract class Wallet implements Transferrable {
    private double balance; // sensitive data

    // Normal wallet creation
    Wallet(double balance) {
        this.balance = balance;
    }

    // Wallet with referral bonus (constructor overloading)
    Wallet(double balance, double referralBonus) {
        this.balance = balance + referralBonus;
    }

    // Encapsulation: controlled access
    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Load money
    public void loadMoney(double amount) {
        addBalance(amount);
    }
}

