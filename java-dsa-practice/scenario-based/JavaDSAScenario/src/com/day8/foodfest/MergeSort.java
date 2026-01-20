package com.day8.foodfest;

import java.util.ArrayList;

public class MergeSort {
	
	public static ArrayList<Stall> mergeTwoList(ArrayList<Stall> a , ArrayList<Stall> b){
		
		ArrayList<Stall> result = new ArrayList<>();
		int idx1 = 0;
		int idx2 = 0;
		
		while(idx1 < a.size() && idx2 < b.size()) {
			
			if(a.get(idx1).getFootFall() <= b.get(idx2).getFootFall()) {
				
				result.add(a.get(idx1++));
			}else {
				result.add(b.get(idx2++));
			}
		}
		
		while(idx1 < a.size()) {
			result.add( a.get(idx1++));
		}
		
		while(idx2 < b.size()) {
			result.add(a.get(idx2++));
		}
		
		return result;
	}
	
	public static ArrayList<Stall> mergeZoneLogs(ArrayList<ArrayList<Stall>> list, int si , int fi) {
		
		if(si == fi) {
			return list.get(si);
		}
		
		int mid = si + (fi - si)/2;
		
		ArrayList<Stall> zone1 = mergeZoneLogs(list, si , mid);
		ArrayList<Stall> zone2 = mergeZoneLogs(list, mid+1, fi );
		
		return mergeTwoList(zone1, zone2);
	}

}
