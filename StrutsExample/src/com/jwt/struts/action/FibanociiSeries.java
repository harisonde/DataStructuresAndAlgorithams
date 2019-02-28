package com.jwt.struts.action;

public class FibanociiSeries {

	public static void main(String[] args) {
		
		for(int i=0; i<=4; i++) {
			System.out.println("Generated fibanocii series is -> " + fib(i));
		}
	}

	private static int fib(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}

		return fib(num-1) + fib(num-2);
	}
}