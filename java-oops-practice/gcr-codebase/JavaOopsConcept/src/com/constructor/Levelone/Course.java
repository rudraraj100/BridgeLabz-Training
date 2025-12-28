package com.constructor.levelone;

public class Course {
		// instance variables
		String courseName;
		int duration;
		double fees;
		
		// class variable
		static String instituteName = "IIM Indore";
		
		// parameterized constructor
		Course(String courseName , int duration , double fees ){
			this.courseName = courseName;
			this.duration = duration;
			this.fees = fees;
		}
		
		// instance method
		void courseDetails(){
			System.out.println("Institute name: " + instituteName);
			System.out.println("Course Name   : " + courseName);
	        System.out.println("Duration      : " + duration);
	        System.out.println("fees          : " + fees);
	        System.out.println();
		}
		// class method to update institute name
		static void updateInstituteName(String newInstituteName) {
	        instituteName = newInstituteName;
	    }

}
