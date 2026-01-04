package com.day2.mybank;


import java.util.Scanner;

public class MyBankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Type (1-Savings, 2-Current): ");
        int choice = sc.nextInt();

        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        Account account;

        if (choice == 1) {
            System.out.print("Enter Opening Balance: ");
            double balance = sc.nextDouble();
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo);
        }

        account.deposit(5000);
        account.withdraw(2000);
        account.calculateInterest();
        account.checkBalance();

        sc.close();
    }
}
