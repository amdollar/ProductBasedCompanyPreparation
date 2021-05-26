package com.java.problems.Array;

public class FactorialOfElements {

	public static void main(String[] args) {
		long arr[] = new long[] { 0, 1, 2, 3, 4 };
		getfactorialArr(arr, arr.length);
		printArray(arr);
	}

	private static void getfactorialArr(long[] arr, int n) {
		for (int i = 0; i <=  - 1; i++) {
			arr[i] = factorial(arr[i]);
		}
	}

	private static long factorial(long n) {
		if (n == 0) {
			return 1;
		}
		return (n * factorial(n - 1));
	}

	private static void printArray(long[] result) {
		for (long i : result) {
			System.out.print(i + " ");
		}
	}
}
