package com.day5.robowarehouse;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> packageWeights = new ArrayList<>();
		
		packageWeights.add(45.5);
		packageWeights.add(12.2);
		packageWeights.add(78.9);
		packageWeights.add(23.3);
		packageWeights.add(56.1);
		packageWeights.add(10.0);
		packageWeights.add(89.7);
		packageWeights.add(34.8);
		packageWeights.add(67.4);
		packageWeights.add(15.6);
		packageWeights.add(90.2);
		packageWeights.add(5.5);
		packageWeights.add(60.3);
		packageWeights.add(25.0);
		
		int n = packageWeights.size();
		
		InsertionSort.insertionSort(packageWeights, n);
		
		System.out.println("Sorted list of packages:");
		for(Double a : packageWeights) {
			System.out.println(a);
		}

	}

}
