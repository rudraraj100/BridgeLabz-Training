package com.day6.icecreamrush;

public class BubbleSort {
	
	public static void bubbleSort(int[] unitsSold) {
		
		for(int turn = 0; turn < unitsSold.length-1 ; turn++) {
			for(int j = 0; j< unitsSold.length-1-turn ; j++) {
				
				if(unitsSold[j] > unitsSold[j+1]) {
					
					int temp = unitsSold[j];
					unitsSold[j] = unitsSold[j+1];
					unitsSold[j+1] = temp;
				}
			}
		}
		
	}

}
