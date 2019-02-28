package com.jwt.struts.action;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {

		String input = "Geeks";

		boolean result = isPalindrome(input, 0, input.length()-1);

		if(result) {
			System.out.println("input string is a Palindrome");
		}else {
			System.out.println("input string is not a Palindrome");
		}

		Set<String> palPartition = new HashSet<>();
		palindromePartiton(input, 0, input.length() -1, palPartition);

		palPartition.forEach(data -> {
			System.out.println(data);
		});
	}

	private static boolean isPalindrome(String input, int start, int end) {
		boolean result = true;
		if(input!= null) {
			while(start <= end) {
				if(input.charAt(start++) != input.charAt(end--)) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

	public static void palindromePartiton(String input, int start, int end, Set<String> finalResult){
		
		if(start > end) {
			return;
		}
		
		System.out.println("inside palindromePartiton");
		for(int i= start; i <= end; i++) {
			boolean result = isPalindrome(input, i, end);
			if(result) {
				finalResult.add(input.substring(i, end + 1));
			}
			palindromePartiton(input, i, end - 1 , finalResult);
		}
	}

}
