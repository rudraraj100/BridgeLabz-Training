package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {
	
	String platform;
	String isRecorded;
	
	public OnlineCourse(String courseName , String duration , String platform ,
	String isRecorded) {
		
		super(courseName ,duration );
		this.platform = platform;
		this.isRecorded = isRecorded;
		
	}
	
	void displayDetail() {
		super.displayDetail();
		System.out.println("Platform: " + platform);
		System.out.println("Recorded yes/no: " + isRecorded);
	}
}
