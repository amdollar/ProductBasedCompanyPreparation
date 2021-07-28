package com.java.problems.Array;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] arr = new int[] { -1, 2, 1, -4 };
		int result = threeSumClosest(arr, 1);
		System.out.println(result);
	}

	public static int threeSumClosest(int[] nums, int target) {
		int difference = Integer.MAX_VALUE;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length-1 && difference != 0; i++) {
			int low = i + 1, high = nums.length - 1;
			int sum = nums[i] + nums[low] + nums[high];
			if (Math.abs(target - sum) < Math.abs(difference)) {
				difference = target - sum;
			}
			if (sum < target) {
				low++;
			} else {
				high--;
			}
		}
		return target - difference;

	}
}
