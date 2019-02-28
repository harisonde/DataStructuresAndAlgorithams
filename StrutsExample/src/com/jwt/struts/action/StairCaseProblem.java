package com.jwt.struts.action;

import java.util.HashMap;
import java.util.Map;

public class StairCaseProblem {
	public static void main(String[] args) {
		System.out.println(" number of ways to climb staircase is ->" 
				+ num_ways(4, 0, new HashMap<Integer, Integer>()));
	}

	private static int num_ways(int numSteps, int currentStep, Map<Integer, Integer> memo) {
		if(memo.containsKey(currentStep)) {
			return memo.get(currentStep);
		}
		
		int result = 0;
		if(currentStep >= numSteps) {
			return 1;
		}

		result = num_ways(numSteps, currentStep + 1, memo);

		if(currentStep + 2 <= numSteps) {
			result += num_ways(numSteps, currentStep + 2, memo);
		}

		memo.put(currentStep, result);
		return result;		
	}
}
