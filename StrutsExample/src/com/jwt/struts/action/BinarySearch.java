package com.jwt.struts.action;

public class BinarySearch {

	public static void main(String[] args) {
		int[] input = new int[] {1, 2, 3, 8, 10, 23, 28, 29};

		int result = binarySearch(input, 0, input.length-1, 1);

		if( result != -1) {
			System.out.println("Input element found at this index " + result);
		}else {
			System.out.println("Input element is not availble in the array ");	
		}

		int[] missingInput = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
		
		int misNumber = missingNumber(missingInput, 0, input.length-1);

		if( misNumber != -1) {
			System.out.println("Missing number is  " + misNumber);
		}else {
			System.out.println("There are no missing numbers found in the input array ");	
		}

	}

	private static int binarySearch(int[] input, int low, int high, int searchElement) {
		int result = -1;
		if(low <= high) {
			int mid = (low + high) /2;

			if(input[mid] == searchElement) {
				result = mid;
			}

			else if(input[mid] < searchElement) {
				result =  binarySearch(input, mid + 1, high, searchElement);
			}

			else if(input[mid] > searchElement) {
				result =  binarySearch(input, low, mid-1, searchElement);
			}
		}	
		return result;
	}

	private static int missingNumber(int[] input, int low, int high) {
		int result = -1;
		if(high - low > 1) {
			int mid = (low + high) /2;

			if(input[mid] == mid) {
				result =  missingNumber(input, mid, high);
			}

			else if(input[mid] > mid) {
				result =  missingNumber(input, low, mid);
			}
		}else{
			if(input[high] - input[low] > 1){
				result = low + 1;
			}
		}
		return result;
	}

}
