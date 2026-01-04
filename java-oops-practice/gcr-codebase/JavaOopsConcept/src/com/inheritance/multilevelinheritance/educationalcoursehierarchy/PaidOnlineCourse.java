package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse {
	
	double fees;
	double discount;
	
	public PaidOnlineCourse(String courseName , String duration , String platform ,
			String isRecorded , double fees ,
	double discount ) {
		
		super(courseName ,duration , platform , isRecorded);
		this.fees = fees* discount/100;
		this.discount = discount;
	}
	
	void displayDetail() {
		super.displayDetail();
		System.out.println("Fees: " + fees );
		System.out.println("Discount: " + discount + "%");
	}

}
