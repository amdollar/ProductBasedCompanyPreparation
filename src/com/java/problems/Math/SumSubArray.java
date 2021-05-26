package com.java.problems.Math;

import java.util.ArrayList;
import java.util.Arrays;

public class SumSubArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 10, 2, 4, 5, 6, 7, 8, 9, 10 };
		int n = arr.length - 1;
		int s = 16;
		ArrayList<Integer> result = getSubArraywithSum(arr, n, s);
		for (int i : result) {
			System.out.println(i);
		}
	}

	private static ArrayList<Integer> getSubArraywithSum(int[] arr, int len, int sum) {
		int i = 0;
		int j = 1;
		int newSum = 0;
		newSum += arr[i] + arr[j];
		ArrayList<Integer> result = new ArrayList<Integer>();
		while (j <= len) {
			if (newSum == sum) {
				result.add(i);
				result.add(j);
				return result;
			} else if (newSum > sum) {
				newSum = newSum - arr[i];
				i++;
			} else {
				j++;
				newSum = newSum + arr[j];
			}
		}
		return result;
	}
}
