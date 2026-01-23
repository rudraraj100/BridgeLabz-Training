package com.day9.medwarehouse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Medicine> list1 = new ArrayList<>();
		
		list1.add( new Medicine("Paracetamol", LocalDate.parse("2026-03-10")));
		list1.add( new Medicine("Amoxicillin",LocalDate.parse("2026-05-25")));
		list1.add( new Medicine("Amoxicillin",LocalDate.parse("2026-08-18")));
		
		ArrayList<Medicine> list2 = new ArrayList<>();
		
		list2.add( new Medicine("Ibuprofen", LocalDate.parse("2026-02-02")));
		list2.add( new Medicine("Azithromycin", LocalDate.parse("2026-06-30")));
		list2.add( new Medicine("Vitamin B12", LocalDate.parse("2026-09-15")));
		
		ArrayList<Medicine> list3 = new ArrayList<>();
		
		list3.add( new Medicine("Insulin", LocalDate.parse("2026-02-20")));
		list3.add( new Medicine("Cough", LocalDate.parse("2026-07-12")));
		list3.add( new Medicine("Antacid", LocalDate.parse("2026-10-01")));
		
		ArrayList<ArrayList<Medicine>> merged = new ArrayList<>();
		
		merged.add(list1);
		merged.add(list2);
		merged.add(list3);
		
		ArrayList<Medicine> masterList = MergeSort.divide(merged, 0 , merged.size()-1);
		
		LocalDate today = LocalDate.now();
		
		System.out.printf("%-15s%-15s%-15s\n\n","Medicine Name", "Expiry Date", "Days Left");
		
        for(Medicine m : masterList) {
            LocalDate expiry = m.getExpiryDate();
            long daysDiff = ChronoUnit.DAYS.between(today, expiry);

            if (daysDiff <= 30 && daysDiff >= 0) {
                // Near expiry
            	System.err.printf("%-15s%-15s%-15d\n",m.getName(), m.getExpiryDate(),daysDiff);
            }
            else if(daysDiff>30){
            	System.out.printf("%-15s%-15s%-15d\n",m.getName(), m.getExpiryDate(),daysDiff);

            }
        }
	}
}