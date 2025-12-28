package com.constructor.levelone;

public class Library {
	
	    // Access modifiers
	    public String ISBN;        
	    protected String title;    
	    private String author;    
	    // Constructor
	    Library(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // Setter for author
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    // Getter for author
	    public String getAuthor() {
	        return author;
	    }
	

}
