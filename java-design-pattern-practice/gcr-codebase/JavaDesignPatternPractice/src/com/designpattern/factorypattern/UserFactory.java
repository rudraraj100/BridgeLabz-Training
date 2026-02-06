package com.designpattern.factorypattern;

public class UserFactory {
	
	public static User createUser(String s) {
		
		switch(s.toLowerCase().trim()) {
			
		case "student" : return new Student();
		case "faculty" : return new Faculty();
		case "librarian" : return Librarian.getLibrarian();
		default : throw new IllegalArgumentException();	
			
		}
	}

}
