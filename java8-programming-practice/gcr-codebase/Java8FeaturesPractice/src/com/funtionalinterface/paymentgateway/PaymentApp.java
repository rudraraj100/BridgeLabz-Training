package com.funtionalinterface.paymentgateway;
public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPal();
        PaymentProcessor stripe = new Stripe();
        PaymentProcessor razor = new Razorpay();

        paypal.pay(500);
        paypal.refund(100);  // custom PayPal refund

        stripe.pay(1000);
        stripe.refund(200);  // default refund

        razor.pay(750);
        razor.refund(150);   // default refund
    }
}
