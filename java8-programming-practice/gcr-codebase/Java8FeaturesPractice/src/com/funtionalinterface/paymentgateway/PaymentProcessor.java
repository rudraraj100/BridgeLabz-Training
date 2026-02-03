package com.funtionalinterface.paymentgateway;
interface PaymentProcessor {

    void pay(double amount);

    // Default refund method
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed (default implementation).");
    }
}
