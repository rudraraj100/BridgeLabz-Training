package com.day8.foodfest;

public class Stall {
	
	private String name;
	private int footFall;
	
	public Stall(String name, int footFall) {
		
		this.name = name;
		this.footFall = footFall;
	}

	public String getName() {
		return name;
	}

	public int getFootFall() {
		return footFall;
	}
	
	public String toString() {
		return "Stall name = " + name + ", Customer counts = " + footFall;
	}
}
