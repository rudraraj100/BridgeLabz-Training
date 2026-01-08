package com.day5.loanbuddy;

public class Applicant {

    private String name;
    private int creditScore;  
    private double income;
    private double loanAmount;

    // Constructor
    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
