package com.java.problems.Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 6, 7 };

		List<List<Integer>> res = combinationSum(arr, 7);
		System.out.println(res);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < candidates.length; i++) {
			for (int j = i; j < candidates.length; j++) {
				if (candidates[i] + candidates[j] == target) {

				}
			}
		}
		return res;
	}
}
