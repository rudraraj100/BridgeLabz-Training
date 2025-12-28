package com.constructor.levelone;

public class Coursemain {
	// main method to test class course
	public static void main(String[] args) {
		Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Analytics", 5, 50000);
        
        c1.courseDetails();
        
        // update institute name
        Course.updateInstituteName("Technocrats institute of technology");
        c2.courseDetails();


	}

}
