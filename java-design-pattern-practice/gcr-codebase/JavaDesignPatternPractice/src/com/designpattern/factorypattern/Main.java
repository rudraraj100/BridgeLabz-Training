package com.designpattern.factorypattern;

// Implement a UserFactory that creates Student, Faculty, or Librarian dynamically.
// Demonstrate polymorphism by calling showRole() on each created object.

public class Main {

	public static void main(String[] args) {
		
		User u1 = UserFactory.createUser("Student");
		User u2 = UserFactory.createUser("Faculty");
		User u3 = UserFactory.createUser("Librarian");
		u1.showRole();
		u2.showRole();
		u3.showRole();
		
		User u4 = UserFactory.createUser("Librarian");
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());
	}

}
