package com.day1.browserbuddy;

// doubly LL
public class Node {	  // node is tab
	public String tabName;
	public Node prev;
	public Node next;
	
	public Node(String tabName) {
		this.tabName = tabName;
		next = null;
		prev = null;
	}
}