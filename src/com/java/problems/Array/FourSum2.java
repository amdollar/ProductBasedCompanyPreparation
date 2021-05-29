package com.java.problems.Array;

/*
 * Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
 */
public class FourSum2 {

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { -2, -1 };
		int[] nums3 = new int[] { -1, 2 };
		int[] nums4 = new int[] { 0, 2 };
		int result = fourSumCount(nums1, nums2, nums3, nums4);
		System.out.println(result);
	}

	public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int result = 0;
		for (int a : nums1) {
			for (int b : nums2) {
				for (int c : nums3) {
					for (int d : nums4) {
						if (a + b + c + d == 0) {
							result++;
						}
					}
				}
			}
		}

		return result;
	}

}
