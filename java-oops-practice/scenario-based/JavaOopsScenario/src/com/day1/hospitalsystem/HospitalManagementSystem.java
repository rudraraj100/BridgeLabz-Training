package com.day1.hospitalsystem;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ravi", 5);
        Patient p2 = new OutPatient(102, "Anita", "03-01-2026");

        Doctor d1 = new Doctor(1, "Cardiology" , "Rudresh");

        Bill bill = new Bill(2000, 0.18, 200);

        // Polymorphism in action
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();
        
        // display bill amount
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}

