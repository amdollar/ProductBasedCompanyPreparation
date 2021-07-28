package com.java.problems.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java.problems.LinkedList.LinkedList;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };

		List<List<Integer>> result = threeSum(nums);
		for (List<Integer> temp : result) {
			for (int i : temp) {
				System.out.println(i);
			}
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int left = i + 1;
				int right = nums.length - 1;
				int sum = 0 - nums[i];
				while (left < right) {
					if (sum == nums[left] + nums[right]) {
						result.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while (left < right && (nums[left] == nums[left + 1]))
							left++;
						while (left < right && (nums[right] == nums[right - 1]))
							right--;
						left++;right--;
					} else if (sum > nums[left] + nums[right]) {
						right--;
					} else {
						left++;
					}
				}

			}
		}
		return result;
	}

	/*
	 * public static List<List<Integer>> threeSum(int[] nums) { List<List<Integer>>
	 * result = new ArrayList<>(); for (int i = 0; i <= nums.length - 2; i++) { int
	 * left = i + 1; int right = i + 2;
	 * 
	 * while (left < right) { List<Integer> temp = null; int sum = nums[i] +
	 * nums[left] + nums[right]; if (sum == 0) { temp = new ArrayList();
	 * temp.add(nums[i]); temp.add(nums[left]); temp.add(nums[right]); } if (sum <
	 * 0) { left++; } else if (sum > 0) { right++; } if (!result.isEmpty())
	 * result.add(temp); } }
	 * 
	 * return result; }
	 */
}
