package com.day1.ewalletapplication;

class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    PersonalWallet(double balance) {
        super(balance);
    }

    PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    // Polymorphism: personal wallet logic
    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer exceeds personal wallet limit");
            return;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Transfer successful (Personal Wallet)");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

