package com.day1.banksystem;

class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void showBalance() {
        System.out.println(name + "'s Balance: " + account.getBalance());
    }

    public Account getAccount() {
        return account;
    }
}
