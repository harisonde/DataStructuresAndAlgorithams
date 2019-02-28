package com.jwt.struts.action;

public class FactorialRecursion {
	
	public static void main(String[] args) {
		int number = 5;
		
		int result = factorial(number);
		
		System.out.println("factorial of 5 is " + result);
		
		System.out.println("Available number of processors are  " +Runtime.getRuntime().availableProcessors());
	}
	
	private static int factorial(int num) {
		int result = 1;
		
		if(num >= 1 ) {	
			result = num * factorial(num -1);
			return result;
		}
		
		return result;
	}

}
