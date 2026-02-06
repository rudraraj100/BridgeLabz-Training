package com.designpattern.builderpattern;

public class Book {
	
	private String title;
	private String author;
	private String genre;
	
	 private Book(BookBuilder builder) {
	        this.title = builder.title;
	        this.author = builder.author;
	        this.genre = builder.genre;
	    }

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "Book-> " + title + "\nauthor= " + author + "\ngenre= " + genre ;
	}
	
	// inner class of book
	
	static class BookBuilder{
	
		private String title;
		private String author;
		private String genre;
		
		public BookBuilder() {
				
		} 
		
		public BookBuilder title(String title) {
			
			this.title = title;
			return this;
			
		}
		
		public BookBuilder author(String author) {
			this.author = author;
			return this;
		}
		
		public BookBuilder genre(String genre) {
			this.genre = genre;
			return this;
		}
		
		public Book build() {
			return new Book(this);
		}
		
	}
	

}
