package com.day5.loanbuddy;

public abstract class Loan implements IApprovable {

    protected Applicant applicant;
    protected int termInMonths;
    protected double interestRate;

    private String loanStatus;   // cannot be changed outside

    // Constructor
    public Loan(Applicant applicant, int termInMonths, double interestRate) {
        this.applicant = applicant;
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }

    // Common EMI formula (used by child classes)
    protected double calculateEMIFormula() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100); // monthly interest
        int N = termInMonths;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }

    // Internal method to update status
    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }
}
