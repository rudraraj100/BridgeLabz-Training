package com.day6.artexpo;

import java.util.ArrayList;


public class TimeInsertionSort {
	
	public static void insertionSort(ArrayList<ArtistInfo> list , int n) {
		
		
		for(int i = 1; i < n-1; i++) {
			ArtistInfo key = list.get(i);
			int j = i-1;
			
		
		while(j >= 0 && list.get(j).getRegistrationTime().isAfter(key.getRegistrationTime())) { 
			
			list.set(j+1 , list.get(j));
			j--;
			
			
		}
		
		list.set(j+1, key);
		
	}
	}

}