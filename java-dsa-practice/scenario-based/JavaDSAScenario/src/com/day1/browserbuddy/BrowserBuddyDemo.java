package com.day1.browserbuddy;

public class BrowserBuddyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Browser chrome = new Browser("Chrome");

		 chrome.openNewTab("YouTube");
		 chrome.openNewTab("LeetCode");
		 chrome.openNewTab("CodeChef");
		 chrome.openNewTab("HackerEarth");

		 chrome.showTabs();
		 System.out.println();

		 chrome.back();
		 chrome.showTabs();
		 System.out.println();

		 chrome.closeCurrentTab();
		 chrome.showTabs();
		 System.out.println();

		 chrome.reOpenTab();
		 chrome.showTabs();
		
		
		
	}

}