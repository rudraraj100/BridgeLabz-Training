package com.designpattern.observerpattern;

// Implement a notification system where subscribed users get notified whenever a
// new book is added to the catalog.

public class Main {

	public static void main(String[] args) {
		Subject library =Library.getLibrary();
		
		Observer aman = new Student("Aman");
		library.subscribe(aman);
		
		library.notifyNewBook("Atomic habits");

		Observer rohan = new Student("Rohan");
		library.subscribe(rohan);
		
		library.notifyNewBook("Power");
	}

}
