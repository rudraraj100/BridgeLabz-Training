package com.day2.mybank;

class SavingsAccount extends Account {
    private final double interestRate = 4.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100; // operator usage
        setBalance(getBalance() + interest);
        System.out.println("Savings Interest Added: ₹" + interest);
    }
}

