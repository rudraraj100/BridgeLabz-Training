package com.day4.eventmanager;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> ticketPrices = new ArrayList<>();

		ticketPrices.add(2500);
		ticketPrices.add(1200);
		ticketPrices.add(5400);
		ticketPrices.add(800);
		ticketPrices.add(3200);
		ticketPrices.add(1500);
		ticketPrices.add(999);
		ticketPrices.add(4500);
		ticketPrices.add(2200);
		ticketPrices.add(600);
		ticketPrices.add(7000);
		ticketPrices.add(1750);
		ticketPrices.add(3000);
		ticketPrices.add(1100);
		ticketPrices.add(5200);
		ticketPrices.add(900);
		ticketPrices.add(2600);
		ticketPrices.add(4300);
		ticketPrices.add(1400);
		ticketPrices.add(10000);
		ticketPrices.add(750);
		ticketPrices.add(2800);
		ticketPrices.add(3900);
		ticketPrices.add(500);
		ticketPrices.add(2000);
		
		
		int n = ticketPrices.size();
		QuickSort.quickSort(ticketPrices, 0, n-1);
		
		// print
		
		for(int i =0; i<n; i++) {
			
			System.out.print("₹" + ticketPrices.get(i) + " --> " );
		}

	}

}
