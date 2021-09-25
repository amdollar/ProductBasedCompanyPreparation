package com.java.problems.Array;

public class SubSequenceOfArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3 };
		printSubsequence(arr);
	}

	private static void printSubsequence(int[] arr) {

		int len = arr.length - 1;
		for (int i = 0; i <= len; i++) {
			for (int j = i; j <= len; j++) {
				System.out.print("[");
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + ",");
				}
				System.out.print("]");
			}
		}
	}

}
