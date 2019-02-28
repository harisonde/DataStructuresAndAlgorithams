package com.jwt.struts.action;

public class Knapsack {

	public static void main(String[] args) {
		int[] values = new int[] {50, 90, 30};
		int[] weights = new int[] {10, 50, 15};

		int result = maxValuePicked(values, weights, 0, 30);
		
		System.out.println("Maximum value picked is " + result);
	}

	private static int maxValuePicked(int[] values, int[] weights, 
			int index, int weightToBePicked ) {
		int result = 0;
		if(index > values.length-1 || weightToBePicked == 0) {
			return 0;
		}
		
		if(weights[index] > weightToBePicked) {
			result = maxValuePicked(values, weights, index+1, weightToBePicked);
		}else {
			result = Math.max(values[index] + maxValuePicked(values, weights, index+1, weightToBePicked - weights[index]), 
					maxValuePicked(values, weights, index+1, weightToBePicked));
		}

		return result;
	}

}