package com.designpattern.observerpattern;

public class Student implements Observer {
	
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public void notified(String bookName) {
		System.out.println(name+ ": " + bookName +" book in the collection: ");
		
	}

}
