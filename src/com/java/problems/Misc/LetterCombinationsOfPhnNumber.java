package com.java.problems.Misc;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhnNumber {

	public static void main(String[] args) {
		String digits = new String("23");
		List<String> answer = letterCombinations(digits);
		System.out.println(answer);
	}

	public static List<String> letterCombinations(String digits) {
		List<String> answer = new ArrayList();
		if (digits == null || digits.length() == 0) {
			return answer;
		}

		String[] store = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		recursiveGeneration(answer, "", digits, 0, store);
		return answer;
	}

	private static void recursiveGeneration(List<String> answer, String current, String digits, int index,
			String[] store) {
		if (index == digits.length()) {
			answer.add(current);
			return;
		}

		String letters = store[digits.charAt(index) - '0'];
		for (int i = 0; i < letters.length(); i++) {
			recursiveGeneration(answer, current + letters.charAt(i), digits, index + 1, store);
		}

	}

}
