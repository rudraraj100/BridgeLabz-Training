package com.day5.loanbuddy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking applicant details from user
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Term (in months): ");
        int term = sc.nextInt();

        // Creating Applicant object using user-defined input
        Applicant applicant = new Applicant(
                name,
                creditScore,
                income,
                loanAmount
        );

        // Polymorphism: Loan reference
        Loan loan = new HomeLoan(applicant, term);

        loan.approveLoan();

        System.out.println("\nLoan Status: " + loan.getLoanStatus());

        if (loan.getLoanStatus().equals("APPROVED")) {
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        }

        sc.close();
    }
}
