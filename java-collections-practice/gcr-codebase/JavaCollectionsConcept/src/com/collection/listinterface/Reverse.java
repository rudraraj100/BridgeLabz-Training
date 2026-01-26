package com.collection.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Reverse {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("ArrayList Before reverse:");
		System.out.println(list);
		
		System.out.println("After reverse:");
		for(int i = 4 ; i >= 0 ; i-- ) {
			
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		LinkedList<Integer> list1 = new LinkedList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println("\nLinkedList Before reverse:");
		System.out.println(list1);
		
		System.out.println("After reverse:");
		for(int i = 4 ; i >= 0 ; i-- ) {
			
			System.out.print(list1.get(i) + " ");
		}
		
		

	}

}
