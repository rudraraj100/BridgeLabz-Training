package com.day9.ecommerceproductinventory;


public class Node {
	
	Product obj;
	Node right;
	Node left;
	
	public Node(Product obj, Node right, Node left) {
		
		this.obj = obj;
		this.right = right;
		this.left = left;
	}
	
	public Node(Product obj) {
		this.obj = obj;
	}
	
	public static Node insert(Node root , Product obj) {
		
		if(root == null) {
			return new Node(obj);
		}
		
		if(root.obj.getSKU().compareToIgnoreCase(obj.getSKU()) > 0) {
			root.left = insert(root.left, obj);
		}
		else if(root.obj.getSKU().compareToIgnoreCase(obj.getSKU()) < 0) {
			root.left = insert(root.right, obj);
		}
		
		return root;
	}
	
	public static Node delete(Node root, String s) {
		
		if(root == null) return null;
		
		if ( root.obj.getSKU().compareToIgnoreCase(s) > 0) {
	        root.left = delete(root.left, s);
	    }
	    else if (root.obj.getSKU().compareToIgnoreCase(s) < 0) {
	        root.right = delete(root.right, s);
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
	        root.right = delete(root.right, is.obj.getSKU());
	    }

	    return root;
	}
	public static Node inorderSuccessor(Node root) {
		
		while(root.left != null) {
			root = root.left;
		}
		
		return root;
		
	}
	
	public static void inorder(Node root) {
		if(root==null) return;
		
		inorder(root.left);
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Sku no." , "prod. Name" , "Price" , "Manu. date");
		System.out.printf("%-15s%-15s%-15s%-15s\n",root.obj.getSKU(), root.obj.getName(), "₹"+root.obj.getPrice(), root.obj.getManufactureDate());
		inorder(root.right);
		
		
	}
	
	public static Node replace(Node root, String s, double p) {
		
		if(root == null) return null;
		
		if(root.obj.getSKU().equals(s)) {
			root.obj.setPrice(p);
			return root;
		}
		else if ( root.obj.getSKU().compareToIgnoreCase(s) > 0) {
	        root.left = replace(root.left, s, p);
	    }
	    else if (root.obj.getSKU().compareToIgnoreCase(s) < 0) {
	        root.right = replace(root.right, s, p);
	    }
	    
		return root;
	}	
}
	
	

