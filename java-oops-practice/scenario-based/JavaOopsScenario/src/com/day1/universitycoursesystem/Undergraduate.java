package com.day1.universitycoursesystem;

class Undergraduate extends Student implements Graded {

    Undergraduate(int id, String name) {
        super(id, name);
    }

    // Letter-grade based GPA
    @Override
    public void assignGrade(double marks) {
        if (marks >= 85)
            setGpa(4.0);
        else if (marks >= 70)
            setGpa(3.0);
        else if (marks >= 50)
            setGpa(2.0);
        else if (marks >= 35)
            setGpa(1.0);
        else
            setGpa(0.0);
    }

    @Override
    void displayInfo() {
    	super.displayInfo();
        System.out.println("Undergraduate student.");
    }
}

