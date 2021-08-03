package com.java.problems.Dynamic;

public class CountingBits {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = countBits(n);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int[] countBits(int n) {

		int[] arr = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int temp = arr[i];
			while (temp > 0) {
				int j = temp & 1;
				temp = temp >> 1;
				if (j > 0) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;
	}

}
