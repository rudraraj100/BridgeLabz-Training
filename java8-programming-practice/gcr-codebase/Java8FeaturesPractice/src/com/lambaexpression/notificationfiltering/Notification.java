package com.lambaexpression.notificationfiltering;

public class Notification {
	
	private String message;
	private String type;
	
	public Notification(String type, String message) {
		
		this.message = message;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Notification [ " + type + ": " + message + ".]";
	}
	
	
	  
	

}
