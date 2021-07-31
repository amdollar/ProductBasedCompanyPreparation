package com.java.problems.Array;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveNumbersSum {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(consecutiveNumbersSum(num));
	}

	public static int consecutiveNumbersSum(int n) {
		int[] arr = new int[n];
		for (int i = 1, j = 0; i <= n; i++, j++) {
			arr[j] = i;
		}
		List<List<Integer>> listOfSumNumbers = new ArrayList();

		for (int i = 0; i <= arr.length; i++) {
			int tempSum = 0;
			List<Integer> tempList = new ArrayList();
			for (int j = i; j <= arr.length - 1; j++) {
				tempList.add(arr[j]);
				tempSum += arr[j];
				if (tempSum > n) {
					tempList.clear();
					break;
				} else if (tempSum == n) {
					listOfSumNumbers.add(tempList);
					break;
				}
			}
		}
		return listOfSumNumbers.size();
	}

}
