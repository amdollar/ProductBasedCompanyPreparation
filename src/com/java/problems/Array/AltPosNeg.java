package com.java.problems.Array;

public class AltPosNeg {

	public static void main(String[] args) {
		int arr[] = new int[] { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		int res[] = getAlternateArr(arr);
		printArray(res);

	}

	private static int[] getAlternateArr(int[] arr) {
		int len = arr.length - 1;
		int[] res = new int[arr.length + 1];
		res[0] = arr[0];
		for (int i = 0; i <= len; i++) {
			if (arr[i] < 0) {
				for (int j = i + 1; j <= len; j++) {
					if (arr[j] >= 0) {
						res[i + 1] = arr[j];
						break;
					}
				}
			} else {
				for (int j = i + 1; j <= len; j++) {
					if (arr[j] < 0) {
						res[i + 1] = arr[j];
						break;
					}
				}
			}
		}
		return res;
	}

	private static void printArray(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	/*
	 * private static void getAlternateArr(int[] arr) { int arrlen = arr.length - 1;
	 * for (int i = 0; i <= arrlen; i++) { if (arr[i] < 0) { // 9 < 0 -> false for
	 * (int j = i + 1; j <= arrlen; j++) { if (arr[j] >= 0) { int temp = arr[j];
	 * arr[j] = arr[i + 1]; arr[i + 1] = temp; break; } } } else { for (int j = i +
	 * 1; j <= arrlen; j++) {// j -> 4 , -2 if (arr[j] <= 0) { // true int temp =
	 * arr[j]; // temp = -2 arr[j] = arr[i + 1]; // arr[i + 1] = temp; break; } } }
	 * } }
	 */
}
