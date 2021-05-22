package com.java.problems.Math;

/* https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
 */
public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 5 };
		int n = 5;
		int missingNumber = getMissingNumber(arr, n);
		System.out.println(missingNumber);
	}

	private static int getMissingNumber(int[] arr, int n) {
		int totalSum = n * (n + 1) / 2;
		int expectedSum = 0;
		for (int i : arr) {
			expectedSum += i;
		}
		return totalSum - expectedSum;
	}

}
