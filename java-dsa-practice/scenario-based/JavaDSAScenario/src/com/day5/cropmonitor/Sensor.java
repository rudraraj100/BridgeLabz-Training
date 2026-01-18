package com.day5.cropmonitor;

import java.time.LocalTime;

public class Sensor {
	
	private LocalTime timing;
	private int temperature;
	
	public Sensor(LocalTime timing, int temperature) {
		
		this.timing = timing;
		this.temperature = temperature;
		
	}
	
	public int getTemperature() {
		return temperature;
	}
	public LocalTime getTiming() {
		return timing;
	}
	
	public String toString() {
		return timing +"-" + temperature + "℃ | " ;
		
	}
	
	
}
