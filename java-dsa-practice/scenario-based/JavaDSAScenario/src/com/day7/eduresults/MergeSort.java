package com.day7.eduresults;

import java.util.ArrayList;

public class MergeSort {
	
	public static void divide(ArrayList<Marks> list , int si, int ei) {
		
		if(si>=ei) {
			return;
		}			
			
		int mid = si + (ei - si)/2;
		divide(list, si, mid);
		divide(list, mid+1, ei);
		merge(list, si, mid, ei );
		
		
	}
	
	public static void merge(ArrayList<Marks> list , int si, int mid, int ei) {
		
		ArrayList<Marks> temp = new ArrayList<>();
		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= ei) {
			if(list.get(idx1).getMarks() < list.get(idx2).getMarks()) {
				temp.add(x++, list.get(idx2++));
			}else {
				temp.add(x++ , list.get(idx1++));
			}
		}
		
		while(idx1 <= mid) {
			temp.add(x++, list.get(idx1++));
		}
		while(idx2 <= ei) {
			temp.add(x++, list.get(idx2++));
			
		}
		
		for(int i = 0, j = si; i< temp.size() ; i++,j++) {
			list.set(j, temp.get(i));
		}
	}

}
