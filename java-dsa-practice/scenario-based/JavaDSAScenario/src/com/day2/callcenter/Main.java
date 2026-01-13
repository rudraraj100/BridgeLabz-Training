package com.day2.callcenter;
public class Main {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        Customer c1 = new Customer(101, "Ravi", false);
        Customer c2 = new Customer(102, "Aman", true);
        Customer c3 = new Customer(103, "Neha", false);

        center.addCall(c1);
        center.addCall(c2);
        center.addCall(c3);
        center.addCall(c2); 

        center.handleNextCall();
        center.handleNextCall();
        center.handleNextCall();

        center.showCallCount();
    }
}
