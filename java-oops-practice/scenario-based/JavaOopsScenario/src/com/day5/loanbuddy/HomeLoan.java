package com.day5.loanbuddy;
public class HomeLoan extends Loan {

    public HomeLoan(Applicant applicant, int termInMonths) {
        super(applicant, termInMonths, 8.5); // lower interest rate
    }

    @Override
    public void approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 30000) {
            setLoanStatus("APPROVED");
        } else {
            setLoanStatus("REJECTED");
        }
    }

    @Override
    public double calculateEMI() {
        return calculateEMIFormula();
    }
}
