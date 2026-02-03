package com.funtionalinterface.temperaturealert;

import java.util.function.Predicate;

// Scenario: Alert if temperature crosses threshold.
// ○ Task: Use Predicate<Double> functional interface.

public class Main {

	public static void main(String[] args) {
		
		Predicate<Double> threshold = x -> x < 70.0;
		
		double temperature = 77.5;
		
		System.out.println(threshold.test(temperature));
		
		

	}

}
