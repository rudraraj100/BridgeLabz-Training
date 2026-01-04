package com.day1.banksystem;

public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(5000, 5);
        Customer customer1 = new Customer("Rudra", sa);

        customer1.deposit(2000);
        customer1.withdraw(1500);
        sa.calculateInterest();
        customer1.showBalance();

        System.out.println("-----------");

        CurrentAccount ca = new CurrentAccount(10000);
        Customer customer2 = new Customer("Raj", ca);

        customer2.withdraw(3000);
        customer2.showBalance();
    }
}

