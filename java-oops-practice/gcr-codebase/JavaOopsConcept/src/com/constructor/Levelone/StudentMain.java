package com.constructor.levelone;

public class StudentMain {

	public static void main(String[] args) {

	        PostgraduateStudent pg = new PostgraduateStudent(
	                101, "Rudra", 8.6, "Computer Science"
	        );

	        pg.displayPGStudentDetails();

	        // Modifying CGPA using public method
	        pg.setCGPA(9.1);
	        System.out.println("Updated CGPA    : " + pg.getCGPA());

	}

}
