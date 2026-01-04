package com.day1.universitycoursesystem;

class Postgraduate extends Student implements Graded {

    Postgraduate(int id, String name) {
        super(id, name);
    }

    // Pass/Fail grading logic
    @Override
    public void assignGrade(double marks) {
        setGpa(marks >= 50 ? 4.0 : 0.0);
    }

    @Override
    void displayInfo() {
    	super.displayInfo();
        System.out.println("Postgraduate Student: ");
    }
}

