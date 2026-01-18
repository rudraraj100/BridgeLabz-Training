package com.day4.examcell;

public class Score {
	
	private String centreName;
	private int obtainScore;

	public Score(String centreName, int obtainScore) {
	
		this.centreName = centreName;
		this.obtainScore = obtainScore;
	}

	public String getCentreName() {
		return centreName;
	}

	public int getObtainScore() {
		return obtainScore;
	}
	public String toString() {
		return obtainScore + " | " + centreName ;
	}

	
	
}
