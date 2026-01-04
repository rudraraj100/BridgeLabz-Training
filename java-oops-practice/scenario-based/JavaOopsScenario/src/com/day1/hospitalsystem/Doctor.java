package com.day1.hospitalsystem;

class Doctor {
    private int doctorId;
    private String specialization;
    private String name;

    Doctor(int doctorId, String specialization , String name) {
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Doctor ID: " + doctorId + ", Specialization: " + specialization + ", Name: " + name);
    }
}

