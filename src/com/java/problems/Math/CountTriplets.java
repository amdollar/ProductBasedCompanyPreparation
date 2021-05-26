package com.java.problems.Math;

import java.util.Arrays;

public class CountTriplets {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 3, 2 };
		int totalTriplets = getTriplets(arr, arr.length - 1);
		System.out.println(totalTriplets);
	}

	private static int getTriplets(int[] arr, int length) {
		// sort the array then start from the largest element and find the other
		// elements making sum to this element.
		int result = 0;
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			int current = arr[i];// 5
			int left = 0;
			int right = i - 1;
			while (left < right) {
				if (arr[left] + arr[right] > current) {
					right--;
				} else if (arr[left] + arr[right] < current) {
					left++;
				} else {
					result++;
					break;
				}
			}
		}
		return result;
	}

	/*
	 * private static int getTriplets(int[] arr, int length) { int result = 0; for
	 * (int i = 0; i <= length; i++) { for (int j = 0; j <= length; j++) { if (i !=
	 * j) { int sum = arr[i] + arr[j]; if (findElementinArray(arr, sum) == true) {
	 * result++; } } } } return result; }
	 * 
	 * private static boolean findElementinArray(int[] arr, int sum) {
	 * 
	 * boolean flag = false; for (int i = 0; i <= arr.length - 1; i++) { if (arr[i]
	 * == sum) { flag = true; System.out.println("a"); return flag; } else { flag =
	 * false; } } return flag; }
	 */
}
