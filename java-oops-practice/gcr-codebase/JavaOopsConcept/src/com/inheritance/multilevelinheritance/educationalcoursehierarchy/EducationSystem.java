package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class EducationSystem {

	public static void main(String[] args) {
		
		Course dsa = new PaidOnlineCourse("dsa" , "6months" , "online" , "yes" , 10000 , 50);
		
		dsa.displayDetail();

	}

}
