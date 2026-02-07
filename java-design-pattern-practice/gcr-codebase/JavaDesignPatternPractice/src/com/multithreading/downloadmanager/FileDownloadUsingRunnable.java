package com.multithreading.downloadmanager;

public class FileDownloadUsingRunnable{
	
	public static void main(String[] args) throws InterruptedException {
		
		FileDownloaderUsingRunnable image = new FileDownloaderUsingRunnable("Document.pdf: 35%");
		FileDownloaderUsingRunnable video= new FileDownloaderUsingRunnable("Image.jpg: 15%");
		FileDownloaderUsingRunnable document = new FileDownloaderUsingRunnable("Video.mp4: 30%");
		
		
		Thread t1 = new Thread(image);
		Thread t2 = new Thread(video);
		Thread t3 = new Thread(document);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("All downlaods are completed");
		
	}

}
