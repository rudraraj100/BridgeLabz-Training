package com.day4.hospitalqueue;

public class BubbleSort {
	
	static void bubbleSort(String[][] record) {
		
		int n = record.length;
		
		for(int i = 0 ; i < n ; i++) {
			
			boolean swapped = false;
			for(int j = 0 ; j < n-i-1 ; j++) {
				
				if(Integer.parseInt(record[j][1]) < Integer.parseInt(record[j+1][1])) {
					
					String namej = record[j][0];
					String crtj  = record[j][1];
					
					String name1 = record[j+1][0];
					String crt1  = record[j+1][1];
					
					record[j][0] = name1;
					record[j][1] = crt1;
					
					record[j+1][0] = namej;
					record[j+1][1] = crtj;
					
					swapped = true;
				}
			}
			
			if(!swapped) {
				return;
			}
			
			
		}
	}

}
