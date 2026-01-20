package com.day8.gamerzone;

import java.util.ArrayList;

public class QuickSort {
	
	public static int partition(ArrayList<Player> list , int st , int end) {
		
		int i = st-1;
		Player pivot = list.get(end);
		
		for(int j = st ; j < end ; j++) {
			if(list.get(j).getScore() > pivot.getScore()) {
				i++;
				
				Player temp = list.get(i);
				list.set(i, list.get(j) );
				list.set(j, temp);
				
			}
			
		}
		i++;
		
		Player temp = list.get(i);
		list.set(i, pivot );
		list.set(end, temp);
		return i;
	}
	
	public static void quickSort(ArrayList<Player> list , int st , int end) {
		
		if(st > end) {
			return;
		}
		int pivot = partition(list, st, end);
		quickSort(list, st, pivot-1);
		quickSort(list, pivot+1, end);
	}
}
