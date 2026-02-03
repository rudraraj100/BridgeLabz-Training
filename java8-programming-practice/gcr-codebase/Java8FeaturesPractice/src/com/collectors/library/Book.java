package com.collectors.library;

public class Book {
	
	private String name;
	private int page;
	private String genre;
	
	public Book(String name, int page, String genre) {
		
		this.name = name;
		this.page = page;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public int getPage() {
		return page;
	}
	public String getGenre() {
		return genre;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", page=" + page + ", genre=" + genre + "]";
	}
	
	

}
