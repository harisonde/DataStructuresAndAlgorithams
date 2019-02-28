package com.jwt.struts.action;

import java.util.Stack;

public class PostOrderIterative {
	
	 static class Node{
		int data;
		Node right, left;
		
		public Node(int data) {
			this.data = data;
		}
	}
	 
	 public static void main(String[] args) {
		 
		 Node root = new Node(10);
		 
		 root.left = new Node(8);
		 root.right = new Node(20);
		 
		 root.left.left = new Node(4);
		 root.left.right = new Node(7);
		 
		 //result should be 4, 7, 8, 20, 10
		 
		 postOrderIterative(root);
	 }
	 
	 private static void postOrderIterative(Node root) {
		 
		 Node current = root;
		 Stack<Node> stack = new Stack<>();
		 
		 while(!stack.isEmpty() || current != null) {
			 if(current != null) {
				 stack.add(current);
				 current = current.left;
				 continue;
			 }
			 
			 Node right = stack.peek().right;
			 
			 if(right != null) {
				 current = right;
			 }else {
				 Node temp = stack.pop();
				 System.out.println(temp.data);
				 
				 while(!stack.isEmpty() && temp.data == stack.peek().right.data) {
					 temp = stack.pop();
					 System.out.println(temp.data);
				 }
			 }
		 }
	 }

}
