package com.java.problems.Array;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int rotateBy = 2;
//		printArr(arr);
//		?rotateArr(arr);
		System.out.println("Normal Array:");
		printArr(arr);
		/*
		 * rotateArrByN(arr, rotateBy); System.out.println(" Clockwise Array");
		 * printArr(arr);
		 *//*
			 * System.out.println(" Anticlockwise Array"); rotateArrByNAnti(arr, rotateBy);
			 */
		/*
		 * System.out.println("\nClockwise Rotated Array:"); rotateArrayClockwise(arr,
		 * rotateBy); printArr(arr);
		 */
		System.out.println("\nAntiClockwise Rotated Array:");
		rotateArrayAntiClockwise(arr, rotateBy);
		printArr(arr);
	}

	private static void rotateArrayAntiClockwise(int[] arr, int rotateBy) {
		rotateArr(arr, 0, arr.length - 1);
		rotateArr(arr, 0, arr.length - rotateBy - 1);
		rotateArr(arr, arr.length - rotateBy, arr.length-1);

	}

	public static void rotateArrayClockwise(int[] arr, int d) {
		rotateArr(arr, 0, arr.length - 1);
		rotateArr(arr, 0, d - 1);
		rotateArr(arr, d, arr.length - 1);
	}

	private static void rotateArr(int[] arr, int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	private static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}

	// clockwise rotation;
	private static void rotateArrByN(int[] arr, int d) {
		while (d >= 0) {
			int length = arr.length - 1;
			int temp = arr[length];
			for (int i = length; i > 0; i--, length--) {
				arr[length] = arr[length - 1];
			}
			arr[length] = temp;
			d--;
		}
	}

	// anticlockwise rotation
	private static void rotateArrByNAnti(int arr[], int d) {
		for (int i = 1; i <= d; i++) {
			leftRotateByOne(arr, d);
		}
	}

	private static void leftRotateByOne(int[] arr, int d) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}

	private static void rotateArr(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
