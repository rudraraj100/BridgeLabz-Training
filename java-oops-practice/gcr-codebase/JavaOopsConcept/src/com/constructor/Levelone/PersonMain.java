package com.constructor.levelone;

public class PersonMain {
	// main method to display class person
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.displayDetail();
		
		Person p2 = new Person("Rohan" , 18 , "999999999");
		p2.displayDetail();
		
		Person p3 = new Person(p1);
		p3.displayDetail();

	}

}
