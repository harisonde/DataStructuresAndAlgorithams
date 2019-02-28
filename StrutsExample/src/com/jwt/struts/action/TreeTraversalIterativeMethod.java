package com.jwt.struts.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class TreeTraversalIterativeMethod {
	private Node root;

	private static class Node{
		Node left, right;
		int data;
		int hd;

		Node(int aData){
			this.data = aData;
			this.hd = Integer.MAX_VALUE;
		}
	}

	private static class Res{
		int val;
	}

	public static void main(String[] args) {

		TreeTraversalIterativeMethod treeTraversal = new TreeTraversalIterativeMethod();

		Node rootNode = new Node(10);
		rootNode.data = 10;
		Node leftNode = new Node(5);
		leftNode.right = new Node(6);
		leftNode.left = new Node(4);
		Node rightNode = new Node(15);
		rightNode.right = new Node(20);
		rightNode.left = new Node(11);
		rightNode.right.left = new Node(21);
		rightNode.right.right = new Node(25);

		rootNode.left = leftNode;
		rootNode.right = rightNode;

		treeTraversal.inOrderTraveral(rootNode);
		treeTraversal.preOrderTraveral(rootNode);
		treeTraversal.postOrderTraveral(rootNode);

		System.out.println("Height of the tree is " + treeTraversal.heightOfTree(rootNode));

		Res res = new Res();
		res.val = 0;
		treeTraversal.maxSumInPath(rootNode, res);
		System.out.println("Max sum in a path is  " + res.val);

		int result = treeTraversal.checkFullBinaryTree(rootNode);
		if(result == -1) {
			System.out.println("Inputted tree is not full binary tree");
		}else {
			System.out.println("Inputted tree is full binary tree");
		}

		treeTraversal.bottomViewOfTree(rootNode);
		
		treeTraversal.removeLeafNodesWithPathLessThanMinNodes(rootNode, 1, 4);
	}

	private void inOrderTraveral(Node root) {
		System.out.println("========= In Order traversal data is ======");

		Node current = root;
		Stack<Node> stack = new Stack<>();

		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			Node currentRoot = stack.pop();

			System.out.println("Tree data is " + currentRoot.data);
			current = currentRoot.right;		
		}
	}

	private void preOrderTraveral(Node root) {
		System.out.println("========= Pre order traversal data is ======");
		Node current = root;
		Stack<Node> stack = new Stack<>();

		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				System.out.println("Tree data is " + current.data);
				stack.push(current);
				current = current.left;
			}
			Node currentRoot = stack.pop();
			current = currentRoot.right;		
		}
	}

	private void postOrderTraveral(Node root) {
		System.out.println("========= Post order traversal data is ======");
		Node current = root;
		Stack<Node> stack = new Stack<>();
		Map<Integer, Integer> map = new HashMap<>();

		while(current != null || !stack.isEmpty()) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}

			Node currentRoot = stack.pop();	
			if(currentRoot.right == null 
					|| map.containsKey(currentRoot.right.data)) {
				System.out.println("Tree data is " + currentRoot.data);
				map.put(currentRoot.data, currentRoot.data);
				current = null;
			}else {
				stack.push(currentRoot);
				current = currentRoot.right;
			}

		}
	}

	public int heightOfTree(Node rootNode) {
		if(rootNode == null) {
			return 0;
		}
		int leftHeight = heightOfTree(rootNode.left);
		int rightHeight = heightOfTree(rootNode.right);

		if(leftHeight < rightHeight) {
			return rightHeight + 1;
		}else {
			return leftHeight + 1;
		}
	}

	public int maxSumInPath(Node rootNode, Res res) {
		if(rootNode == null) {
			return 0;
		}

		int l = maxSumInPath(rootNode.left, res);
		int r = maxSumInPath(rootNode.right, res);

		int maxOnly = Math.max(Math.max(l, r) + rootNode.data, rootNode.data);

		int maxRoot = Math.max((l + r + rootNode.data), maxOnly);

		res.val = Math.max(maxRoot, res.val);

		return maxOnly;
	}

	private int checkFullBinaryTree(Node node) {
		if(node == null) {
			return 0;
		}

		int l = checkFullBinaryTree(node.left);
		int r = checkFullBinaryTree(node.right);

		if(l != r || (l == -1 || r == -1)) {
			return -1;
		}else {
			return 1;
		}
	}

	private void bottomViewOfTree(Node node) {
		if(node != null) {
			Map<Integer, Integer> bottomMap = new TreeMap<>();
			Queue<Node> queue = new LinkedList<>();

			queue.add(node);
			node.hd = 0;

			while(!queue.isEmpty()) {
				Node temp = queue.poll();
				bottomMap.put(temp.hd, temp.data);

				if(temp != null) {
					if(temp.left != null) {
						queue.add(temp.left);
						temp.left.hd = temp.hd-1;
					}

					if(temp.right != null) {
						queue.add(temp.right);
						temp.right.hd = temp.hd + 1;
					}
				}
			}

			if(!bottomMap.isEmpty()) {
				Iterator<Integer> valuesSet = bottomMap.values().iterator();

				while(valuesSet.hasNext()) {
					System.out.println(valuesSet.next());
				}
			}
		}
	}
	
	private Node removeLeafNodesWithPathLessThanMinNodes(Node node, int level, int k) {
			if(node == null) {
				return null;
			}
			node.left = removeLeafNodesWithPathLessThanMinNodes(node.left, level +1, k);
			node.right = removeLeafNodesWithPathLessThanMinNodes(node.right, level +1, k);
			
			if(node.left == null && node.right == null && level < k) {
				return null;
			}
			
			return node;
	}
}