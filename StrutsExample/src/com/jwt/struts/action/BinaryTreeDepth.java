package com.jwt.struts.action;

import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

//Java program to find height of tree 

//A binary tree node 
class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class BinaryTreeDepth 
{ 
	Node root; 

	/* Compute the "maxDepth" of a tree -- the number of 
	nodes along the longest path from the root node 
	down to the farthest leaf node.*/
	int maxDepth(Node node) 
	{ 
		if (node == null) 
			return 0; 
		else
		{ 
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left); 
			int rDepth = maxDepth(node.right); 

			/* use the larger one */
			if (lDepth > rDepth) 
				return (lDepth + 1); 
			else
				return (rDepth + 1); 
		} 
	} 
	
	/* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
		// Regular expression in Java to check if String is number or not
        Pattern pattern = Pattern.compile(".*[^0-9].*");
       //Pattern pattern = Pattern.compile(".*\\D.*");
       String [] inputs = {"123"};
      
       for(String input: inputs){
           System.out.println( "does " + input + " is number : "
                                + !pattern.matcher(input).matches());
       }
		
		BinaryTreeDepth tree = new BinaryTreeDepth(); 

		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.left.right.left = new Node(6); 

		System.out.println("Height of tree is : " + 
									tree.maxDepth(tree.root)); 
		
		System.out.println("Height of tree is : " + 
				tree.treeHeight(tree.root)); 
	}
	
	// Iterative method to find height of Bianry Tree 
    int treeHeight(Node node)  
    { 
        // Base Case 
        if (node == null) 
            return 0; 
   
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        
        int height = 0;
        while(true) {
        	 int nodeCount = queue.size();
        	 if(nodeCount == 0) {
        		 return height;
        	 }
        	 height++;
        	 while(nodeCount > 0) {
             	Node next = queue.poll();
             	if(next != null) {  		
             		if(next.left != null) {
             			queue.add(next.left);
             		}
             		if(next.right != null) {
             			queue.add(next.right);
             		}
             	}	
             	nodeCount--;
             }
        	
        }
    } 
} 


