package com.java.problems.Array;

public class Test {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println(isCovered(arr, 2, 6));

	}

	public static boolean isCovered(int[][] ranges, int left, int right) {
		int sum = 0;
		int total = right - left;
		for (int[] temp : ranges) {
			for (int i : temp) {
				if (left <= i) {
					sum++;
				}
				if (right >= i) {
					break;
				}
			}
		}
		return sum == total;
	}

}
