package com.day5.loanbuddy;
public class AutoLoan extends Loan {

    public AutoLoan(Applicant applicant, int termInMonths) {
        super(applicant, termInMonths, 10.5); // higher interest rate
    }

    @Override
    public void approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000) {
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
