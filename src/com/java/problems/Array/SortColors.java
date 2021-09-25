package com.java.problems.Array;

public class SortColors {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 0, 1 };
		sortColors(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void sortColors(int[] nums) {
		int left = 0;
		int mid = 0;
		int right = nums.length - 1;

		// if mid == 0 then swap it with left increment left and mid
		// if mid == 1 do nothing just increment mid
		// if mid == 2 then swap mid with right decrement right

		while (mid <= right) {
			int current = nums[mid];
			switch (current) {
			case 0: {
				int temp = nums[mid];
				nums[mid] = nums[left];
				nums[left] = temp;
				left++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp = nums[mid];
				nums[mid] = nums[right];
				nums[right] = temp;
				right--;
				break;
			}
			}
		}

	}

}
