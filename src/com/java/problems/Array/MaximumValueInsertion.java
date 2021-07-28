package com.java.problems.Array;

public class MaximumValueInsertion {
	public static void main(String[] args) {
		String value = "-999";
		int val = 1;
		String res = maxValue(value, val);
		System.out.println(res);
	}

	public static String maxValue(String n, int x) {
		StringBuilder num = new StringBuilder(n);
		if (n.charAt(0) == '-') {
			int i = 1;
			while (i <= n.length() - 1 && n.charAt(i) - '0' <= x)
				i++;
			num.insert(i, x);
			return num.toString();
		} else {
			int i = 0;
			while (i <= n.length() - 1 && n.charAt(i) - '0' >= x)
				i++;
			num.insert(i, x);
			return num.toString();
		}
	}

}
