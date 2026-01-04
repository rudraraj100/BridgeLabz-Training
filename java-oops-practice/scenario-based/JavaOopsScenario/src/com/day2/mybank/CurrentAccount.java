package com.day2.mybank;

class CurrentAccount extends Account {
    private final double interestRate = 1.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Current Account Interest Added: ₹" + interest);
    }
}

