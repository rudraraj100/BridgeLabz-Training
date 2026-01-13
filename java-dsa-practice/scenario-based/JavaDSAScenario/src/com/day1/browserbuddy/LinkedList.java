package com.day1.browserbuddy;

// doubly LL
public class LinkedList {
	Node head;
	Node currentTab;
	
	public void insertFromEnd(String tabName) {
		Node newNode = new Node(tabName);
		
		if(head == null) {
			head = newNode;
			currentTab = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
		currentTab = newNode;
	}
	
	public void goBack() {
		if(currentTab != null && currentTab.prev != null) {
			currentTab = currentTab.prev;
		}
		else {
			 System.out.println("No previous tab");
		}
	}
	
	public void goForward() {
		if(currentTab != null && currentTab.next != null) {
			currentTab = currentTab.next;
		}
		else {
			 System.out.println("No next tab");
		}
	}
	
	
	public Node deleteCurrentTab() {
		 if (currentTab == null) 
			 return null;

		 Node deleted = currentTab;

		 if (currentTab.prev != null)
			 currentTab.prev.next = currentTab.next;
		 else
			 head = currentTab.next;

		 if (currentTab.next != null)
			 currentTab.next.prev = currentTab.prev;
		 
		 currentTab = (currentTab.next != null) ? currentTab.next : currentTab.prev;
		 return deleted;
	}	
	
	public void showAllTabs() {
		if(head == null) {
			System.out.println("No Tabs Currently....");
		}
		else {
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.tabName + ", ");
				temp = temp.next;
			}
		}
	}
}