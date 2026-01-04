package com.day1.hospitalsystem;

class InPatient extends Patient {
    private int daysAdmitted;

    InPatient(int id, String name, int daysAdmitted) {
        super(id, name);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Days Admitted: " + daysAdmitted);
    }
}

