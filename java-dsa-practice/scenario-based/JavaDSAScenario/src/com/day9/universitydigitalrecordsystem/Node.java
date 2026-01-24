package com.day9.universitydigitalrecordsystem;

public class Node{
		
		Student obj;
		Node left;
		Node right;
		
		public Node(Student obj) {
			this.obj = obj;
		}
	
	public static Node insert(Node root, Student obj) {
		if(root == null) {
			return new Node(obj);
			 
		}
		
		if(root.obj.getRollNum() > obj.getRollNum() ) {
			root.left = insert(root.left, obj);	
		}
		else {
			root.right = insert(root.right, obj);
		}
		
		return root;
		
	}
	
	public static void inorder(Node root) {
		if(root==null) return;
		
		inorder(root.left);
		System.out.printf("%-15d%-15s%-15s\n",root.obj.getRollNum(), root.obj.getName(), root.obj.getCity());
		inorder(root.right);
		
		
	}
	
	public static Boolean display(Node root, Student obj) {
		
		if(root.obj == null) {
			System.out.println("False");
			return false;
			
		}
		
		if(root.obj.getRollNum() > obj.getRollNum()) {
			return display(root.left , obj);
		}
		
		else if(root.obj.getRollNum() == obj.getRollNum()) {
			System.out.print(" " + root.obj);
			
			return true;
			
		}else {
			return display(root.right, obj);
		}
		
	}
	
	public static Node delete(Node root, long roll){
		
		if (root == null) {
	        return null;
	    }

	    if (roll < root.obj.getRollNum()) {
	        root.left = delete(root.left, roll);
	    }
	    else if (roll > root.obj.getRollNum()) {
	        root.right = delete(root.right, roll);
	    }
	    else {
	        

	      
	        if (root.left == null && root.right == null) {
	            return null;
	        }

	     
	        if (root.left == null) {
	            return root.right;
	        }
	        if (root.right == null) {
	            return root.left;
	        }

	       
	        Node is = inorderSuccessor(root.right);
	        root.obj = is.obj;
	        root.right = delete(root.right, is.obj.getRollNum());
	    }

	    return root;
	}
	
	public static Node inorderSuccessor(Node root) {
		
		while(root.left != null) {
			root = root.left;
		}
		
		return root;
		
	}
	

}
