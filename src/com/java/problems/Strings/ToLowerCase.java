package com.java.problems.Strings;

public class ToLowerCase {

	public static void main(String[] args) {
		String s = "Hello";
		String res = toLowerCase(s);
		System.out.println(res);
	}

	public static String toLowerCase(String s) {
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch >= 65 && ch <= 95) {
				ch += 32;
			}
			sb.append(ch);
		}

		return sb.toString();
	}

}
