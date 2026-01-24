package com.day10.ticketbookingevent;

import java.time.LocalDate;

public class Event {
	
	private String name;
	private LocalDate eventDate;
	
	public Event(String name, LocalDate eventDate) {
		
		this.name = name;
		this.eventDate = eventDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}
	
	
	
	

}
