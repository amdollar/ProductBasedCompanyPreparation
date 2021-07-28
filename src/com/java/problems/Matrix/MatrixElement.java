package com.java.problems.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixElement {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8;
		int result = kthSmallest(matrix, k);
		System.out.println(result);
	}

	public static int kthSmallest(int[][] matrix, int k) {
		int n = matrix[0].length;
		int m = matrix.length;
		ArrayList<Integer> list = new ArrayList<>();
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				list.add(matrix[i][j]);
			}
		}
		result = list.stream().sorted().skip(k - 1).findFirst().get();
		return result;
	}

}
