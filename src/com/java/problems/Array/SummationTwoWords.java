package com.java.problems.Array;

public class SummationTwoWords {

	public static void main(String[] args) {
		String a = "acb";
		String b = "cba";
		String c = "cdb";
		System.out.println(isSumEqual(a, b, c));
	}

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

		boolean result = false;
		int val1 = getInt(firstWord);
		int val2 = getInt(secondWord);
		int val3 = getInt(targetWord);

		if (val1 + val2 == val3) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	private static int getInt(String firstWord) {
		int res = 0;
		for (char ch : firstWord.toCharArray()) {
			res = res * 10 + ch - 'a';
		}
		return res;
	}
}
