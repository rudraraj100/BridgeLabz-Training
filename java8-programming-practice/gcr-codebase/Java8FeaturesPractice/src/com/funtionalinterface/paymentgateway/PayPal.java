package com.funtionalinterface.paymentgateway;

public class PayPal implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("PayPal payment of " + amount + " completed.");
    }

    // Optional override
    @Override
    public void refund(double amount) {
        System.out.println("PayPal refund of " + amount + " completed.");
    }
}

class Stripe implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Stripe payment of " + amount + " completed.");
    }
   
}

class Razorpay implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Razorpay payment of " + amount + " completed.");
    }
   
}
