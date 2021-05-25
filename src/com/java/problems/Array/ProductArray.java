package com.java.problems.Array;

public class ProductArray {

	public static void main(String[] args) {
		int ar[] = new int[] { 10, 3, 5, 6, 2 };
		// space -> O(n) time -> O(n^2)
		long productArr[] = getProductArr(ar);

		int resultArr[] = getProductArrTwo(ar);

		printArray(resultArr);
	}

	private static int[] getProductArrTwo(int[] arr) {
		int n = arr.length	;

		int left[] = new int[n];
		int right[] = new int[n];
		int productRes[] = new int[n];
		left[0] = 1;
		right[n - 1] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = arr[i - 1] * left[i - 1];
		}
		for (int j = n - 2; j >= 0; j--) {
			right[j] = arr[j + 1] * right[j + 1];
		}
		for (int k = 0; k < n; k++) {
			productRes[k] = left[k] * right[k];
		}

		return productRes;
	}

	private static long[] getProductArr(int[] ar) {
		long res[] = new long[ar.length];
		for (int i = 0; i <= ar.length - 1; i++) {
			long product = 1;
			for (int j = 0; j <= ar.length - 1; j++) {
				if (i != j) {
					product *= ar[j];
				}
				res[i] = product;
			}
		}
		return res;
	}

	private static void printArray(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
