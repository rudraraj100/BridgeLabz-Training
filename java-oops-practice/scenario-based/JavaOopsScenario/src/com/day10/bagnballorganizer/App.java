package com.day10.bagnballorganizer;

import java.util.Scanner;

public class App {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Bag bag = new Bag("B1", "Red", 3);

	        bag.addBall(new Ball("BL1", "Blue", "Small"));
	        bag.addBall(new Ball("BL2", "Green", "Medium"));
	        bag.addBall(new Ball("BL3", "Yellow", "Large"));
	        bag.addBall(new Ball("BL4", "Pink", "Small")); // blocked

	        bag.displayBalls();
	        bag.removeBall();

	        System.out.println("\nAfter removing one ball:");
	        bag.displayBalls();

	        System.out.println("\nTotal balls in bag: " + bag.getBallCount());
	    }

}