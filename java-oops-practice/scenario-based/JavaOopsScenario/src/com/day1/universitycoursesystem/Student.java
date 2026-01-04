package com.day1.universitycoursesystem;

class Student {
    protected int studentId;
    protected String name;
    private double gpa; // sensitive academic data

    // Constructor without electives
    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with electives
    Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // Encapsulation
    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Polymorphism
    void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }

    public void viewTranscript() {
        System.out.println("GPA: " + gpa);
    }
}

