package com.day6.smartlibrary;

import java.util.ArrayList;

public class TitleInsertionSort {
	
	public static void insertionSort(ArrayList<BookInfo> list ) {
		
		for(int i = 1 ; i < list.size(); i++) {
			
			BookInfo key = list.get(i);
			int j = i-1;
			
			while(j >=0 && list.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
				list.set(j+1, list.get(j));
				j--;
			}
			
			list.set(j+1, key);
		}
	}

}
