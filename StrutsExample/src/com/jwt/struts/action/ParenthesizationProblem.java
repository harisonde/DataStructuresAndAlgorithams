package com.jwt.struts.action;

import java.util.ArrayList;
import java.util.List;

public class ParenthesizationProblem {

	static List<String> combinations = new ArrayList<>();

	public static void main(String[] args) {

		String[] symbol = new String[]{"T", "F", "T"};  
		String[] operators = new String[]{"^", "&"}; 

		numWays(symbol, operators, 0, 0, "");
		
		for(String comb: combinations) {
			System.out.println("Generated combination is " + comb);
		}
		
	}

	private static void numWays(String[] symbol, String[] operator,int symbolIndex, 
			int operatorIndex, String result) {
		if((symbolIndex + operatorIndex) > (symbol.length + operator.length) -1 ) {
			if(result != null && result.length() > 0) {
				combinations.add(result);
			}
		}else {
			if(symbolIndex + 1 < symbol.length) {
				numWays(symbol, operator, symbolIndex+2, operatorIndex + 1, result+ "(" + symbol[symbolIndex] + "" + operator[operatorIndex] + symbol[symbolIndex + 1] +")");
				numWays(symbol, operator, symbolIndex+1,operatorIndex+1, result + symbol[symbolIndex] + "" + operator[operatorIndex]);
			}else if(symbolIndex < symbol.length) {
				String operatorValue = operatorIndex > operator.length -1 ? "" : operator[operatorIndex];
				numWays(symbol, operator, symbolIndex+1, operatorIndex+1, result + operatorValue +""+ symbol[symbolIndex]);
			}
		}
	}

}
