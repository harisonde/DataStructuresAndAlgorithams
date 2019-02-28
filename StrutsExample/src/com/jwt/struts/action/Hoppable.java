package com.jwt.struts.action;

public class Hoppable {

	public static void main(String[] args) {
		int[] input = new int[] {3, 4, 1, 2, 1, 0};

		System.out.println("Input array is hoppable -> " + isHoppable(input, 0));
	}

	private static boolean isHoppable(int[] input, int pos) {
		if(input[pos] == 0 || pos >= input.length-1) {
			return false;
		}

		int height = input[pos];

		while(height > 0) {
			if(pos + height >= input.length ) {
				return true;
			}else if(input[pos + height] == 0) {
				height--;
				continue;
			}
			
			if(isHoppable(input, pos + height)){
				return true;
			}
			
			height--;
		}
		return false;
	}

}
