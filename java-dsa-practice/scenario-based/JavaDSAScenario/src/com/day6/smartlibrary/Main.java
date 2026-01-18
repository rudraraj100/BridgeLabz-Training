package com.day6.smartlibrary;

import java.util.ArrayList;

public class Main {
	
	public static void main() {
		
		ArrayList<BookInfo> list = new ArrayList<>();
		
		list.add(new BookInfo("The almanack"));
		list.add(new BookInfo("july"));
		list.add(new BookInfo("Atomic habit"));
		list.add(new BookInfo("Rainbow"));
		list.add(new BookInfo("Power"));
		list.add(new BookInfo("Nature"));
		list.add(new BookInfo("single"));
		list.add(new BookInfo("Trading mastery"));
		
		System.out.println("Before sorting:");
		for(BookInfo a : list) {
			System.out.println(a);		
		}
		
		System.out.println();		
		TitleInsertionSort.insertionSort(list);
		
		System.out.println("After sorting:");
		for(BookInfo a : list) {
			System.out.println(a);		
		}
		
		
	}

}
