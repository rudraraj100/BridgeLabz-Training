package com.designpattern.observerpattern;

public interface Subject {
	
	void unsubscribe(Observer ob);
	
	void subscribe(Observer ob);
	
	void notifyNewBook(String s);
}
