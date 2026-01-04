package com.day1.hospitalsystem;

class OutPatient extends Patient {
    private String visitDate;

    OutPatient(int id, String name, String visitDate) {
        super(id, name);
        this.visitDate = visitDate;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Visit Date: " + visitDate);
    }
}
