package com.day4.zipzipmart;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Sales> record = new ArrayList<>();
		
		record.add(new Sales ( "2026-01-11", 4000 ) ); 
		record.add(new Sales ( "2026-01-14", 100  ) );
		record.add(new Sales ( "2026-01-05", 250  ) );
		record.add(new Sales ( "2026-01-08", 300  ) );
		record.add(new Sales ( "2026-01-09", 1500 ) );
		record.add(new Sales ( "2026-01-03", 450  ) );
		record.add(new Sales ( "2026-01-02", 1150 ) );
		
		int n = record.size();
		
		System.out.println("Before Sorting: ");
		
		for(int i = 0 ; i < record.size(); i++) {
			
			System.out.println(record.get(i));
		}
//		
		SaleMergeSort.divide(record, 0 , n-1);
		
		System.out.println("\nAfter sorting:");
		
		for(int i = 0 ; i < record.size(); i++) {
			
			System.out.println(record.get(i));
		}
		
		
		
		
	}

}
