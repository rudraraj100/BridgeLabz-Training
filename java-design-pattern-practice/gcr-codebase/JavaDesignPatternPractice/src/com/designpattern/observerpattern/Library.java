package com.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Subject{
	
	private static Library library;
	
	
	
	private Library() {
		if(library != null) {
			throw new RuntimeException();
		};
	}

	List<Observer> subs = new ArrayList<>();
	
	public static Library getLibrary() {
		
		synchronized (Library.class){
			if(library == null) {
				return library = new Library();
			}
		}
		
		return library;
		
	}

	@Override
	public void unsubscribe(Observer ob) {
		this.subs.remove(ob);
		
	}

	@Override
	public void subscribe(Observer ob) {
		this.subs.add(ob);
		
	}

	@Override
	public void notifyNewBook(String bookName) {
		
		for(Observer o : this.subs) {
			o.notified(bookName);;
		}
	}

}
