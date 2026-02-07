package com.multithreading.downloadmanager;

public class FileDownloaderUsingRunnable implements Runnable {
	public String name;
	
	public FileDownloaderUsingRunnable(String name) {
		
		this.name = name;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " : " + name);
		
		}catch(InterruptedException  e) {
			System.out.println(e);
			
		}
		
	}
	
	
}
