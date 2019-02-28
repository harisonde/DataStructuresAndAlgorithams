package com.jwt.struts.action;

public class StringPermutation { 
	
	static int count = 0;

	public static void main(String args[]) { 
		permutation("123"); 
	}

	/* * A method exposed to client to calculate permutation of String in Java. */ 
	public static void permutation(String input){ 
		permutation("", input); 
		System.out.println("Permunation called these number of times " + count);
	} 
	
	public static void permutation(String input, String word) {
		count++;
		if(word.isEmpty()) {
			System.out.println(input);
		}
		else {
			for(int i =0; i < word.length(); i++) {
				permutation(input + word.charAt(i), word.substring(0, i) + word.substring(i+1, word.length()));
			}
		}
		
		
	}
}


