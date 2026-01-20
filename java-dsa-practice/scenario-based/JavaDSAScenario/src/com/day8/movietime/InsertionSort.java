package com.day8.movietime;

import java.time.LocalTime;
import java.util.ArrayList;

public class InsertionSort {
	
	public static void insertionSort(ArrayList<Movie> list , int n) {
		
		for(int i = 1; i < n; i++) {
			Movie key = list.get(i);
			int j = i-1;
			
			while(j >= 0 && list.get(j).getShowTime().isAfter(key.getShowTime()) ){ 
				
				list.set(j+1 , list.get(j));
				j--;
			}
			
			list.set(j+1, key);
		}	
		
		
	}

}
