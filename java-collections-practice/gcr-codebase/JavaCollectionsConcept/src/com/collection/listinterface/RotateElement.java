package com.collection.listinterface;

import java.util.LinkedList;

public class RotateElement {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("input-" + list);
		
		int k =2;
		int n = list.size();
        k = k % n;   // handles k > size

        for (int i = 0; i < k; i++) {
            int first = list.removeFirst();
            list.addLast(first);
        }
        
        System.out.println("output-" + list);

	}

}
