package com.day1.ewalletapplication;

class Transaction {
    private String sender;
    private String receiver;
    private double amount;

    Transaction(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public void showTransaction() {
        System.out.println(sender + " sent ₹" + amount + " to " + receiver);
    }
}
