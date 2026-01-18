package com.day4.eventmanager;

import java.util.ArrayList;

public class QuickSort {
	
	public static int partition(ArrayList<Integer> list, int low,int high) {
		
		int pivot = list.get(high);
		int i = low-1;
		
		for(int j = low; j < high ; j++) {
			if(list.get(j) < pivot) {
				i++;
			
				// swap
				int temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j , temp);
			}
		}
		
		i++;
		int temp = list.get(i);
		list.set(i, pivot);
		list.set(high, temp);
		return i;
		
	}
	
	public static void quickSort(ArrayList<Integer> list , int low , int high) {
		
		if(low<high) {
			int pidx = partition(list, low, high);
			
			quickSort(list, low , pidx-1);
			quickSort(list, pidx+1, high);
		}
		
	}

}
