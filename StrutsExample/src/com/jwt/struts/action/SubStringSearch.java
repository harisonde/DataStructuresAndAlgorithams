package com.jwt.struts.action;

public class SubStringSearch {

	public static void main(String[] args) {

		String input = "abcTestTestTeseTest";
		String subString = "TestTese";

		// TestTestTese

		//Prefix pattern
		// {0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7,0}
		int[] kmpPatternArray = buildKmpPattern(subString);
		searchSubString(input, subString);

		kmpSubStringSearch(input, subString, kmpPatternArray);

	}

	private static boolean searchSubString(String input, String searchString) {
		boolean result = false;

		int i = 0;
		int searchIndex = 0;
		while(i < input.length()) {
			if((i + searchIndex) >= input.length()) {
				break;
			}
			if(input.charAt(i + searchIndex) == searchString.charAt(searchIndex)) {
				searchIndex++;
				if(searchIndex == searchString.length()) {
					result = true;
					System.out.println("Input string found at the location "
							+ "starting from " + (i)  + " and ending at " + (i + searchString.length() -1));

					i = i + searchIndex;
					searchIndex = 0;
				}
				continue;
			}else{
				i++;
				searchIndex = 0;
			}
		}
		return result;
	}

	//	String input = "TestTestTese";
	//	String subString = "TestTese";

	private static boolean kmpSubStringSearch(String input, String searchString, int[] prefixArray) {
		boolean result = false;

		int i = 0;
		int j = 0;
		while(i < input.length()) {
			if(input.charAt(i) == searchString.charAt(j)) {
				j++;
				i++;
				if(j == searchString.length()) {
					result = true;
					System.out.println("Input string found at the location "
							+ "starting from " + (i-j)  + " and ending at " + (i-1));
					j = 0;
				}
			}else{
				if(j != 0) {
					j = prefixArray[j-1];
				}else {
					i++;
				}
			}
		}
		return result;
	}

	//abcd abcdabcd

	//result[] = {0, 0, 0, 1, 2, 3, 4, 5, 1}

	private static int[] buildKmpPattern(String input) {
		int j=0;
		int[] result = new int[input.length()];
		result[0] = 0;
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(j) == input.charAt(i)) {
				result[i] = j++ + 1;
			}else {
				while(j != 0) {
					j = result[j-1];
					if(input.charAt(j) == input.charAt(i)) {
						result[i] = j++ + 1;
						break;
					}
				}
			}
		}
		return result;
	}
}
