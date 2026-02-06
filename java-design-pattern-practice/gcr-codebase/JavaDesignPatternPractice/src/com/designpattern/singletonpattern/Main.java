package com.designpattern.singletonpattern;

// Design a system where only one library catalog exists across the application.
// Demonstrate how you prevent multiple catalogs from being created.

public class Main {

	public static void main(String[] args) {

		Library l1 = Library.getLibrary();
		System.out.println(l1.hashCode());
		
		Library l2 = Library.getLibrary();
		System.out.println(l2.hashCode());
	}

}
