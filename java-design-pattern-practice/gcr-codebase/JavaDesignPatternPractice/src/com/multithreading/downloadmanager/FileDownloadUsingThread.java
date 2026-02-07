package com.multithreading.downloadmanager;

public class FileDownloadUsingThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		FileDownloaderUsingThread t1 = new FileDownloaderUsingThread("Document.pdf: 35%");
		FileDownloaderUsingThread t2 = new FileDownloaderUsingThread("Image.jpg: 15%");
		FileDownloaderUsingThread t3 = new FileDownloaderUsingThread("Video.mp4: 30%");
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		System.out.println("All downlaods are completed");
		

	}

}
