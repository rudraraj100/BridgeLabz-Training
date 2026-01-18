package com.day5.cinemahouse;

import java.time.LocalTime;

public class BubbleSort {
	
	public static void bubbleSort(String[][] show) {
		
		int n = show.length;
		
		for(int i = 0; i<n; i++) {
			boolean swapped = false;
			for(int j = 0; j<n-1-i ; j++) {
				
				LocalTime t1 = LocalTime.parse(show[j][0]);
				LocalTime t2 = LocalTime.parse(show[j+1][0]);
				
				if(t1.isAfter(t2)){
					
					String namej = show[j][0];
					String crtj  = show[j][1];
					
					String name1 = show[j+1][0];
					String crt1  = show[j+1][1];
					
					show[j][0] = name1;
					show[j][1] = crt1;
					
					show[j+1][0] = namej;
					show[j+1][1] = crtj;
					
					swapped = true;
					
				}
			}
			
			if(!swapped) {
				return;
			}
		}
	}

}
