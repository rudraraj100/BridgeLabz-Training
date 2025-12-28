package com.constructor.levelone;

public class Student {
	    // Access modifiers
	    public int rollNumber;      // accessible everywhere
	    protected String name;      // accessible in subclasses
	    private double cgpa;        // accessible only inside this class

	    // Constructor
	    Student(int rollNumber, String name, double cgpa) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.cgpa = cgpa;
	    }

	    // Public method to access CGPA
	    public double getCGPA() {
	        return cgpa;
	    }

	    // Public method to modify CGPA
	    public void setCGPA(double cgpa) {
	        if (cgpa >= 0.0 && cgpa <= 10.0) {
	            this.cgpa = cgpa;
	        } else {
	            System.out.println("Invalid CGPA value");
	        }
	    }
	    
}
