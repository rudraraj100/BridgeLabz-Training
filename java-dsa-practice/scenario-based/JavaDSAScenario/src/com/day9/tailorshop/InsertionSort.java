package com.day9.tailorshop;

import java.util.ArrayList;

public class InsertionSort {
	
	public static void insertionSort(ArrayList<Order> list, int i) {
		
		
			
			Order key = list.get(i);
			int j = i-1;
			
			while(j >= 0 && list.get(j).getDeadline().isAfter(key.getDeadline())) {
				
				list.set(j+1, list.get(j));
				j--;
			
			}
			
			list.set(j+1, key);
		
		
	}
}
