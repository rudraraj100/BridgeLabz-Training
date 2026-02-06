package com.designpattern.builderpattern;

// Create a Book class using Builder Pattern where title is mandatory, but author,
// edition, and genre are optional. Demonstrate creation of books with varying
// attributes.

public class Main {

	public static void main(String[] args) {


		Book b1 = new Book.BookBuilder().title("Atomic habit").author("James bond").genre("self help").build();
		System.out.println(b1);
	}

}
