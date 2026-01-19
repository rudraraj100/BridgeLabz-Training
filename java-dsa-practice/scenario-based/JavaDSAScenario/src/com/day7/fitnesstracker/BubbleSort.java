package com.day7.fitnesstracker;

public class BubbleSort {
	
	public static  void bubbleSort(String[][] list) {
		
		int n = list.length;
		
		for(int i = 0 ; i < n ; i++) {
			
			int flag = 0;
			
			for(int j = 0 ; j < n-i-1 ; j++) {
				
				if(Integer.parseInt(list[j][1]) > Integer.parseInt(list[j+1][1])) {
					
					String tempSteps = list[j+1][1];
					String tempName = list[j+1][0];
					list[j+1][1] = list[j][1];
					list[j+1][0] = list[j][0];
					
					list[j][1] = tempSteps;
					list[j][0] = tempName;
					flag++;
				}
			}
			
			if( flag== 0) {
				break;
			}
		}
		
	}

}
