package com.day1.ewalletapplication;

public class EWalletApplication {
    public static void main(String[] args) {

        Wallet w1 = new PersonalWallet(3000, 200); // referral bonus
        Wallet w2 = new BusinessWallet(10000);

        User u1 = new User(1, "Ravi", w1);
        User u2 = new User(2, "Anita", w2);

        System.out.println("Initial Balance Ravi: ₹" + u1.getWallet().getBalance());
        System.out.println("Initial Balance Anita: ₹" + u2.getWallet().getBalance());

        // Polymorphic transfer
        u1.getWallet().transferTo(u2, 2000);
        u2.getWallet().transferTo(u1, 3000);

        System.out.println("Final Balance Ravi: ₹" + u1.getWallet().getBalance());
        System.out.println("Final Balance Anita: ₹" + u2.getWallet().getBalance());
    }
}













