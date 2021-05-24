package com.java.problems.Array;

public class MajorityElements {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		int result = majorityElements(arr);
		System.out.println(result);
	}

	private static int majorityElements(int[] arr) {

		if (arr.length == 1)
			return arr[0];
		int majorityElement = arr[0];
		int count = 1;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] == majorityElement) {
				count++;
			} else {
				count--;
				if (count == 0) {
					majorityElement = arr[i];
					count = 1;
				}
			}
		}
		return majorityElement;
	}
}
