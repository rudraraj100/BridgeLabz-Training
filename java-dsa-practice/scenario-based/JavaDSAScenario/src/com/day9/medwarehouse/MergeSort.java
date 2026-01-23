package com.day9.medwarehouse;

import java.util.ArrayList;

public class MergeSort {
	
	public static ArrayList<Medicine> divide(ArrayList<ArrayList<Medicine>> list, int si , int fi) {
		
		if(si == fi) {
			return list.get(si);
		}
			
			int mid = si + (fi-si)/2;
			
			ArrayList<Medicine> list1 = divide(list, si , mid);
			ArrayList<Medicine> list2 = divide(list, mid+1, fi );
			
			return mergeTwoList(list1, list2);
		
		
	}
	
	public static ArrayList<Medicine> mergeTwoList(ArrayList<Medicine> a, ArrayList<Medicine> b) {
		
		int idx1 = 0;
		int idx2 = 0;
		
		ArrayList<Medicine> temp = new ArrayList<Medicine>();
		
		while(idx1 < a.size() && idx2 < b.size()) {
			if(a.get(idx1).getExpiryDate().isBefore(b.get(idx2).getExpiryDate())) {
				
				temp.add(a.get(idx1++));
			}
			else {
				temp.add(b.get(idx2++));
			}
		}	
		while(idx1 < a.size()) {
			temp.add(a.get(idx1++));
		}
		
		while(idx2 < b.size()) {
			temp.add(b.get(idx2++));
		}
		
		return temp;
			
	}

}
