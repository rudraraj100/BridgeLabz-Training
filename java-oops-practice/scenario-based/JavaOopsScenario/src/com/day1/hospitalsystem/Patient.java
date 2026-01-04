package com.day1.hospitalsystem;

class Patient {
    protected int patientId;
    protected String name;
    private String medicalHistory; // sensitive data

    // Normal admission constructor
    Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = "Not Disclosed";
    }

    // Emergency admission constructor (Overloading)
    Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation: controlled access
    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    // Polymorphism
    void displayInfo() {
        System.out.println(getSummary());
    }
}

