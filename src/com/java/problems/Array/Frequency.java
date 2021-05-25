package com.java.problems.Array;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 2, 3, 5 };
		int n = 5; // elements in the array
		int p = 5;// numbers present in array from 1 to p
		getFrequencyArr(arr, n, p);
		printArray(arr);

	}

	private static void getFrequencyArr(int[] arr, int n, int p) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
//		int resultArr[] = new int[n];
		for (int i = 1, j = 0; i <= n; i++, j++) {
			if (!map.containsKey(i)) {
				arr[j] = 0;
			} else {
				arr[j] = map.get(i);
			}
		}
//		return resultArr;
	}

	private static void printArray(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
