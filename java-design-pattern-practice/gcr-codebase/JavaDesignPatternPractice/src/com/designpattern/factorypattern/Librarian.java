package com.designpattern.factorypattern;

public class Librarian implements User {
	
	private static Librarian librarian;

	private Librarian() {
		if(librarian != null) {
			throw new RuntimeException();
		}
	}
	
	
	public static Librarian getLibrarian() {
		
		synchronized(Librarian.class){
			if(librarian == null) {
				return librarian = new Librarian();
				
			}
		}
		
		return librarian;
		
	}


	@Override
	public void showRole() {
		System.out.println("I'm a librarian");
		
	}
	

}
