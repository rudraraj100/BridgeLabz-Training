package com.day9.musicapp;

public class Node {
	
	public Song obj;
	public Node left;
	public Node right;
	
	public Node(Song obj) {
		
		this.obj = obj;
	}
	
	public static Node insert(Node root , Song obj) {
		
		if(root == null) return new Node(obj);
		
		else if(root.obj.getTitle().compareToIgnoreCase(obj.getTitle()) < 0) {
				root.right = insert(root.right, obj);
		}
		else if(root.obj.getTitle().compareToIgnoreCase(obj.getTitle()) > 0) {
			root.left = insert(root.left, obj);
		}
		return root;
	}
	
	public static boolean search(Node root, String track_Id) {
		
		if(root == null) return false;
		
		if (root.obj.getTrack_Id().equals(track_Id)) {
			return true;
		}
		else if(root.obj.getTrack_Id().compareToIgnoreCase(track_Id) > 0) {
			return search(root.right, track_Id);
		}
		else {
			return search(root.left, track_Id);
		}
		
	}
	
	public static void inorder(Node root) {
		if(root == null) return;
		
		inorder(root.left);
		
		System.out.printf("%-15s%-15s\n", root.obj.getTrack_Id(), root.obj.getTitle());
		inorder(root.right);
		
		
	}

}
