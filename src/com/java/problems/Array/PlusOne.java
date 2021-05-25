package com.java.problems.Array;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 9, 9 };
		int[] result = plusOne(arr);
		printArray(result);
	}

	private static void printArray(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	private static int[] plusOne(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 9) {
				arr[i] = arr[i] + 1;
				return arr;
			} else {
				arr[i] = 0;
			}
		}
		int[] res = new int[arr.length + 1];
		res[0] = 1;
		return res;
	}

}
