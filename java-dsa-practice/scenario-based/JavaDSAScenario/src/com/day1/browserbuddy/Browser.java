package com.day1.browserbuddy;
import java.util.*;

public class Browser {
	public String name;
	public Node currentTab;
	LinkedList doublyLL;
	Stack<Node> closedTabs;
	
	public Browser(String name) {
		this.name = name;
		doublyLL = new LinkedList();
		closedTabs = new Stack<>();
	}
	
	public void openNewTab(String tabName) {
		doublyLL.insertFromEnd(tabName);
	}
	
	public void closeCurrentTab() {
		Node deleted = doublyLL.deleteCurrentTab();
		if(deleted != null) {
			closedTabs.push(deleted);
		}
	}
	
	public void reOpenTab() {
		if(!closedTabs.isEmpty()) {
			doublyLL.insertFromEnd(closedTabs.peek().tabName);
			closedTabs.pop();
		}
	}
	
	public void back() {
		doublyLL.goBack();
	}

	public void forward() {
		doublyLL.goForward();
	}

	public void showTabs() {
		doublyLL.showAllTabs();
	}
}