package com.funtionalinterface.unitconversion;

public interface Tool {

	static double kgTolbs(double d) {
		d = d * 2.2;
		
		return d;
		
	}
	
	static double kmTomiles(double d) {
		d = d * 0.6;
		
		return d;
		
	}
}
