package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class Course {
	
	String courseName;
	String duration;
	
	public Course(String courseName , String duration) {
		this.courseName = courseName;
		this.duration = duration;
		
	}
	
	void displayDetail() {
		System.out.println("Course name: " + courseName);
		System.out.println("Course duration: " + duration);
	}
}
