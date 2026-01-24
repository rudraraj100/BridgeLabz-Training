package com.day10.hospitalmanagement;

public class Node {
	
	public Patient patient;
	public Node left, right;
	public int height;
	
	public Node(Patient patient) {
		
		this.patient = patient;
		this.height = 1;
	}
	
	public static int height(Node n) {
		return n == null? 0: n.height;
	}
	
	public static int getBalance(Node n) {
		return n == null? 0: height(n.left) - height(n.right);
	}
	
	public static Node rightRotate(Node y) {
		
		Node x = y.left;
	    Node t2 = x.right;

	    x.right = y;
	    y.left = t2;

	    y.height = Math.max(height(y.left), height(y.right)) + 1;
	    x.height = Math.max(height(x.left), height(x.right)) + 1;

	    return x;
	}
	
	public static Node leftRotate(Node x) {
	    
		Node y = x.right;
	    Node t2 = y.left;

	    y.left = x;
	    x.right = t2;

	    x.height = Math.max(height(x.left), height(x.right)) + 1;
	    y.height = Math.max(height(y.left), height(y.right)) + 1;

	    return y;
	}
	
	public static Node insert(Node root, Patient p) {

	    if (root == null) return new Node(p);

	    if (root.patient.getCheckInTime().isAfter(p.getCheckInTime()))
	        root.left = insert(root.left, p);
	    else if (root.patient.getCheckInTime().isBefore(p.getCheckInTime()))
	        root.right = insert(root.right, p);
	    else
	        return root; 

	    root.height = 1 + Math.max(height(root.left), height(root.right));
	    int balance = getBalance(root);

	    // LL
	    if (balance > 1 &&
	        p.getCheckInTime().isBefore(root.left.patient.getCheckInTime()))
	        return rightRotate(root);

	    // RR
	    if (balance < -1 &&
	        p.getCheckInTime().isAfter(root.right.patient.getCheckInTime()))
	        return leftRotate(root);

	    // LR
	    if (balance > 1 &&
	        p.getCheckInTime().isAfter(root.left.patient.getCheckInTime())) {
	        root.left = leftRotate(root.left);
	        return rightRotate(root);
	    }

	    // RL
	    if (balance < -1 &&
	        p.getCheckInTime().isBefore(root.right.patient.getCheckInTime())) {
	        root.right = rightRotate(root.right);
	        return leftRotate(root);
	    }

	    return root;
	}
	public static Node delete(Node root, String name) {

	    if (root == null) return null;

	    if (root.patient.getName().compareToIgnoreCase(name) > 0)
	        root.left = delete(root.left, name);
	    else if (root.patient.getName().compareToIgnoreCase(name) < 0)
	        root.right = delete(root.right, name);
	    else {
	        if (root.left == null || root.right == null) {
	            root = (root.left != null) ? root.left : root.right;
	        } else {
	            Node temp = root.right;
	            while (temp.left != null)
	                temp = temp.left;

	            root.patient = temp.patient;
	            String s = temp.patient.getName();
	            root.right = delete(root.right, s);
	        }
	    }

	    if (root == null) return null;

	    root.height = Math.max(height(root.left), height(root.right)) + 1;
	    int balance = getBalance(root);

	    if (balance > 1 && getBalance(root.left) >= 0)
	        return rightRotate(root);

	    if (balance > 1 && getBalance(root.left) < 0) {
	        root.left = leftRotate(root.left);
	        return rightRotate(root);
	    }

	    if (balance < -1 && getBalance(root.right) <= 0)
	        return leftRotate(root);

	    if (balance < -1 && getBalance(root.right) > 0) {
	        root.right = rightRotate(root.right);
	        return leftRotate(root);
	    }

	    return root;
	}
	
	public static void display(Node root) {
	    if (root == null) return;

	    display(root.left);
	    System.out.println( root.patient.getCheckInTime() + " → " + root.patient.getName());
	    display(root.right);
	}
	
	

}

	
	
	

