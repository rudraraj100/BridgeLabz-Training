package com.designpattern.singletonpattern;

public class Library {
	
	private static Library library;
	
	private Library() {
		
		if(library != null) {
			throw new RuntimeException();
		}
		
	}
	
	public static Library getLibrary() {
		
		
		synchronized(Library.class) {
			if(library==null) {
				return library = new Library();
			}
			return library;
		}
	}

}
