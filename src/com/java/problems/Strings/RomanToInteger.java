package com.java.problems.Strings;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = new String("LVIII");
		Integer number = getRomanToInteger(s);
		System.out.println(number);
	}

	private static Integer getRomanToInteger(String s) {
		int result = 0;

		int left = 0;
		int right = left + 1;
		for (int i = 0; i < s.length() - 1; i++)
			if (getIntForRoman(s.charAt(i + 1)) > getIntForRoman(s.charAt(i))) {
				result = result - getIntForRoman(s.charAt(i));
			} else {
				result = result + getIntForRoman(s.charAt(i));
			}
		return Integer.valueOf(result);

	}

	private static int getIntForRoman(char ch) {
		int result = 0;
		switch (ch) {
		case 'I':
			result = 1;
			break;
		case 'V':
			result = 5;
			break;
		case 'X':
			result = 10;
			break;
		case 'L':
			result = 50;
			break;
		case 'C':
			result = 100;
			break;
		case 'D':
			result = 500;
			break;
		case 'M':
			result = 1000;
			break;
		default:
			result = 0;
		}
		return result;
	}

}
