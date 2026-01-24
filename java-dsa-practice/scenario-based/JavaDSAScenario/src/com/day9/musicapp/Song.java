package com.day9.musicapp;

public class Song {
	
	private String title;
	private String track_Id;
	
	public Song(String title, String track_Id) {
	
		this.title = title;
		this.track_Id = track_Id;
	}

	public String getTitle() {
		return title;
	}

	public String getTrack_Id() {
		return track_Id;
	}
	
	
	
	
}
