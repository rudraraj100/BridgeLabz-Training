package com.day6.fleetmanager;

import java.util.ArrayList;

public class MileageMergeSort {
	
	public static void divide(ArrayList<VehicleData> list , int si, int ei) {
		
		if(si >= ei) {
			return;
		}
		
		int mid = si + (ei - si)/2;
		divide(list, si, mid);
		divide(list , mid+1 , ei);
		merge(list, si, mid, ei);
		
	}
	
	public static void merge(ArrayList<VehicleData> list , int si, int mid,  int ei) {
		
		ArrayList<VehicleData> merged = new ArrayList<>();
		int idx1 = si;
		int idx2 = mid +1;
		int x = 0;
		
		while(idx1 <= mid && idx2 <= ei) {
			if(list.get(idx1).getMileage() > list.get(idx2).getMileage()) {
				merged.add(x++ , list.get(idx2++));
			}else {
				merged.add(x++ , list.get(idx1++));
			}
		}
		while(idx1 <= mid) {
			merged.add(x++ , list.get(idx1++));
		}
		while( idx2 <= ei) {
			merged.add(x++ , list.get(idx2++));
		}
		
		for(int i = 0, j = si ; i < merged.size() ; i++, j++) {
			list.set(j, merged.get(i));
		}
	}
}
