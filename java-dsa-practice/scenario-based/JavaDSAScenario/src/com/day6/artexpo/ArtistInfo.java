package com.day6.artexpo;

import java.time.LocalTime;

public class ArtistInfo {
	
	private String name;
	private LocalTime registrationTime;
	
	public ArtistInfo(LocalTime registrationTime, String name) {
		
		this.name = name;
		this.registrationTime = registrationTime;
	}

	public String getName() {
		return name;
	}

	public LocalTime getRegistrationTime() {
		return registrationTime;
	}
	
	@Override
	public String toString() {
		return name + "|" + registrationTime;
	}
	
	

}
