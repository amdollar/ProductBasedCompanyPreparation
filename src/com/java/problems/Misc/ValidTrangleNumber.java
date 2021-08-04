package com.java.problems.Misc;

import java.util.Arrays;

public class ValidTrangleNumber {

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 2, 3, 4 };
		int noOfTringles = triangleNumber(nums);
		System.out.println(noOfTringles);
	}

	public static int triangleNumber(int[] nums) {
		int res = 0;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int k = i + 2;
			for (int j = i + 1; j < nums.length - 1; j++) {
				while (k < nums.length && nums[i] + nums[j] > nums[k])
					k++;
				res += k - j - 1;
			}

		}

		return res;
	}

}

// if a+b >= c 
// 
