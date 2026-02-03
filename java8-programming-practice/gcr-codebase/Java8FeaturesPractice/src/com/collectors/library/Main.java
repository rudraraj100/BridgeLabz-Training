package com.collectors.library;


import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<>();
		
		list.add(new Book("Atomic habit" , 300 , "Self help")); 
		list.add(new Book("The Alchemist", 250, "Fiction"));
		list.add(new Book("Rich Dad Poor Dad", 400, "Finance"));
	    list.add(new Book("Deep Work", 350, "Productivity"));
	    list.add(new Book("Think and Grow Rich", 450, "Finance"));
	    list.add(new Book("Clean Code", 550, "Programming"));
	    list.add(new Book("The Power of Now", 320, "Spiritual"));
	    list.add(new Book("Zero to One", 380, "Business"));
	    list.add(new Book("Ikigai", 280, "Self Help"));
	    list.add(new Book("The Psychology of Money", 420, "Finance"));
	    
	    
	    System.out.println("Total pages per genre:\n ");
	    Map<String, Integer> totalPagesPerGenre = list.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.summingInt(Book::getPage)));
	    
	    totalPagesPerGenre.forEach((genre , totalPages)->
	    			
	    					System.out.println(genre + " : "+ totalPages)
	    );
	    
	    System.out.println("\nAverage pages per genre: ");
	    
	    Map<String, Double> avgPagesPerGenre = list.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.averagingInt(Book::getPage)));
	    
	    avgPagesPerGenre.forEach((genre , avgPages)->
	    			
	    					System.out.println(genre + " : "+ avgPages)
	    );
	    
	    System.out.println("\nMaximum pages per genre: ");
	    
	    Map<String, Optional<Book>> maximumPagesPerGenre = list.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.maxBy(Comparator.comparingInt(Book::getPage))));
	    
	    maximumPagesPerGenre.forEach((genre , maximumPages)->
	    			
	    					System.out.println(genre + " : "+ maximumPages.get())
	    );
	    
	}

}
