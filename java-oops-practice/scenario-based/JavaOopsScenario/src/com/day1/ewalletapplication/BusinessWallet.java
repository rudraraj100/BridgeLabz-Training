package com.day1.ewalletapplication;

class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% transaction tax

    BusinessWallet(double balance) {
        super(balance);
    }

    BusinessWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    // Polymorphism: business wallet logic with tax
    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (deductBalance(totalDeduction)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Transfer successful (Business Wallet)");
        } else {
            System.out.println("Insufficient balance after tax");
        }
    }
}

