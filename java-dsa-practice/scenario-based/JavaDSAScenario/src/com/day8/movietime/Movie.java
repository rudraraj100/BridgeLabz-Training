package com.day8.movietime;


import java.time.LocalTime;

public class Movie {
	
	private String name;
	private LocalTime showTime;
	
	public Movie(String name, LocalTime showTime) {
		;
		this.name = name;
		this.showTime = showTime;
	}

	public String getName() {
		return name;
	}

	public LocalTime getShowTime() {
		return showTime;
	}
	
	public String toString() {
		return "Movie name = " + name + ", ShowTime = "  + showTime ;
	}
	
	
	
}
