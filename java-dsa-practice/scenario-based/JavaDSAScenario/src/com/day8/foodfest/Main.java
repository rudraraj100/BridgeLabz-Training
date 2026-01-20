package com.day8.foodfest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Stall> zoneA = new ArrayList<>();
		
		zoneA.add(new Stall ("Burger hub" , 100));
		zoneA.add(new Stall ("Pizza Point" , 110));
		
		ArrayList<Stall> zoneB = new ArrayList<>();
		
		zoneB.add(new Stall ("Taco town" , 90));
		zoneB.add(new Stall ("Pasta Palace" , 120));
		
		ArrayList<Stall> zoneC = new ArrayList<>();
		
		zoneC.add(new Stall ("Ice cream cart" , 80));
		zoneC.add(new Stall ("Coffee Corner" , 95));
		
		ArrayList<ArrayList<Stall>> zones = new ArrayList<>();
		zones.add(zoneA);
		zones.add(zoneB);
		zones.add(zoneC);
		
		ArrayList<Stall> masterList = MergeSort.mergeZoneLogs(zones, 0 , zones.size()-1);
		
		for(Stall s : masterList) {
			System.out.println(s);
		}
	}

}
