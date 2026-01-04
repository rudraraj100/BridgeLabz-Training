package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
	
	String name;
	String bio;
	
	
	public Author(String name , String bio , String title , long publicationYear){
		super( title , publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	void displayInfo() {
		
		System.out.println("Book name:        " + title );
		System.out.println("Publication year: " + publicationYear );
		System.out.println("Author name:      " + name);
		System.out.println("Author bio:       " + bio );
	}
	

}