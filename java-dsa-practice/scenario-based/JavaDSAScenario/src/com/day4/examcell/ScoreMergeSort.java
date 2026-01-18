package com.day4.examcell;

import java.util.ArrayList;

public class ScoreMergeSort {
	
	public static void divide(ArrayList<Score> marks , int si , int ei) {
		
		if(si>= ei) {
			return;
		}
		
		int mid = si + (ei - si)/2; 
		divide(marks, si, mid);
		divide(marks, mid+1 , ei);
		merge(marks, si, ei, mid);
			
	}
	
	public static void merge(ArrayList<Score> marks , int si , int ei, int mid) {
		ArrayList<Score> merged = new ArrayList<>();
		
		int idx1 = si;
		int idx2 = mid +1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= ei) {
			
			if(marks.get(idx1).getObtainScore() < marks.get(idx2).getObtainScore()) {
				merged.add(x++ , marks.get(idx1++));		
			} else {
				merged.add(x++ , marks.get(idx2++));
			}
		}
		
		while(idx1 <= mid) {
			
			merged.add(x++ , marks.get(idx1++));			
		}
		
		while(idx2 <= ei) {
			merged.add(x++ , marks.get(idx2++));
		}
		
		for(int i = 0 , j = si ; i < merged.size() ; i++ ,j++) {
			
			marks.set(j, merged.get(i));
			
		}
		
	}

}
