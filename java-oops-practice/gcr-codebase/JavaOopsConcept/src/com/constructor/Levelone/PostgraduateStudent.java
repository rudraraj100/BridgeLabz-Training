package com.constructor.levelone;

// subclass
public class PostgraduateStudent extends Student {

		    String specialization;

		    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
		        super(rollNumber, name, cgpa);
		        this.specialization = specialization;
		    }

		    void displayPGStudentDetails() {
		        System.out.println("Roll Number     : " + rollNumber); // public
		        System.out.println("Name            : " + name);       // protected
		        System.out.println("CGPA            : " + getCGPA());  // private via method
		        System.out.println("Specialization  : " + specialization);
		    }

}
