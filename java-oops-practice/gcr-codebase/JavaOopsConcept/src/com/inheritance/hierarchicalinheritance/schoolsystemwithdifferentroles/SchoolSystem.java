package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class SchoolSystem {

	public static void main(String[] args) {
		
		Person p1 = new Student("Rudra" , 21 , 12);
		p1.displayRole();
		
		Person p2 = new Teacher("Rudresh" , 21 , "Java");
		p2.displayRole();

	}

}
