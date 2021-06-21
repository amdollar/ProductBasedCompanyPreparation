package com.java.problems.Stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStackOp {

	public static void main(String[] args) {
		int[] target = new int[] { 1, 3 };
		int n = 3;
		List<String> result = buildArray(target, n);
		result.stream().forEach(System.out::println);
	}

	private static List<String> buildArray(int[] target, int n) {
		List<String> result = new ArrayList<>();
		for (int i = 1, j = 0; i <= n; i++) {
			result.add("push");
			if (target[j] == i) {
				j++;
			}else {
				result.add("pop");
			}
		}
		return result;
	}

}
