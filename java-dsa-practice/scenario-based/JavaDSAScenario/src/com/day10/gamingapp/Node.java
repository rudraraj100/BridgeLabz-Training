package com.day10.gamingapp;

public class Node {
	
	public Player obj;
	public int height;
	public Node left, right;
	
	public Node(Player obj) {
		
		this.obj = obj;
		height = 1;
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
	
	public static Node insert(Node root, Player p) {

	    if (root == null) return new Node(p);

	    if (p.getScore() >= root.obj.getScore())
	        root.left = insert(root.left, p);
	    else if (p.getScore() < root.obj.getScore())
	        root.right = insert(root.right, p);
	    else
	        return root; 

	    root.height = 1 + Math.max(height(root.left), height(root.right));
	    int balance = getBalance(root);

	    // LL
	    if (balance > 1 && p.getScore() > root.left.obj.getScore())
	        return rightRotate(root);

	    // RR
	    if (balance < -1 && p.getScore() < root.right.obj.getScore())
	        return leftRotate(root);

	    // LR
	    if (balance > 1 && p.getScore() < root.left.obj.getScore()) {
	        root.left = leftRotate(root.left);
	        return rightRotate(root);
	    }

	    // RL
	    if (balance < -1 && p.getScore() > root.right.obj.getScore()) {
	        root.right = rightRotate(root.right);
	        return leftRotate(root);
	    }

	    return root;
	}

	static int count = 0;

	public static void topPlayers(Node root) {
	    if (root == null || count >= 10) return;

	    topPlayers(root.left);

	    if (count < 10) {
	        System.out.println(root.obj.getName() + " → " + root.obj.getScore());
	        count++;
	    }

	    topPlayers(root.right);
	}
	
	public static Node delete(Node root, String name) {

	    if (root == null) return null;

	    if (root.obj.getName().compareToIgnoreCase(name) > 0)
	        root.left = delete(root.left, name);
	    else if (root.obj.getName().compareToIgnoreCase(name) < 0)
	        root.right = delete(root.right, name);
	    else {
	        if (root.left == null || root.right == null) {
	            root = (root.left != null) ? root.left : root.right;
	        } else {
	            Node temp = root.right;
	            while (temp.left != null)
	                temp = temp.left;

	            root.obj = temp.obj;
	            String s = temp.obj.getName();
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



	
	

}
