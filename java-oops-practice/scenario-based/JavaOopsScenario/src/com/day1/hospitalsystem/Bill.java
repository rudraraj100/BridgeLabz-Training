package com.day1.hospitalsystem;

class Bill implements Payable {
    private double consultationFee;
    private double taxRate;
    private double discount;

    Bill(double consultationFee, double taxRate, double discount) {
        this.consultationFee = consultationFee;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    // Operators used for tax & discount calculation
    @Override
    public double calculatePayment() {
        double tax = consultationFee * taxRate;
        return consultationFee + tax - discount;
    }
}
