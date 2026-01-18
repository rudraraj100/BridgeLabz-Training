package com.day5.robowarehouse;

import java.util.ArrayList;

public class InsertionSort {
	
	public static void insertionSort(ArrayList<Double> list, int n ) {
		
		for(int i = 1; i < n; i++) {
			double key = list.get(i);
			int j = i-1;
			
			while(j >= 0 && list.get(j) > key) { 
				
				list.set(j+1 , list.get(j));
				j--;
			}
			
			list.set(j+1, key);
		}	
		
		
	}

}
