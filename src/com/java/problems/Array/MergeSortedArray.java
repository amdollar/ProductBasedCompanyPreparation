package com.java.problems.Array;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[] { 0 };
		int nums2[] = new int[] { 1 };
		char m = 0;
		int n = 1;
		merge(nums1, m, nums2, n);
		for (int i : nums1)
			System.out.println(i);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int l1 = m - 1;
		int l2 = n - 1;
		int totall = nums1.length - 1;

		while (l2 >= 0) {
			if (l1 >= 0 && nums1[l1] > nums2[l2]) {
				nums1[totall] = nums1[l1];
				l1--;
				totall--;
			} else {
				nums1[totall] = nums2[l2];
				l2--;
				totall--;
			}
		}
	}
	
	//statrting from end of arr1, we will compare the ending element of both the arrays, 
    // whichever element is greater then insert that into the end of first arr. 
    // after inserting that element into the last do increment and decrement in arr points //accordingly.

}
