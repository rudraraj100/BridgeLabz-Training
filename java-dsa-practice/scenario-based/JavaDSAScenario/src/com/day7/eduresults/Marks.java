package com.day7.eduresults;

public class Marks {
	
	private String state;
	private int marks;
	private String name;
	
	public Marks(String state, int marks, String name) {
		
		this.state = state;
		this.marks = marks;
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " | " + marks + "    |  " + state;
	}
	

}
