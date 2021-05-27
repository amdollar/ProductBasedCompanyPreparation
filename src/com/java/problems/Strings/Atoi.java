package com.java.problems.Strings;

/*
 * The atoi() function in C takes a string (which represents an integer) as an argument and returns its value of type int. So basically the function is used to convert a string argument to an integer.
 */
public class Atoi {

	public static void main(String[] args) {
		String num = " 3443 helo";
		int val = myAtoi(num);
		System.out.println(val);

	}

	private static int myAtoi(String num) {
		int result = 0;
		num = num.toLowerCase().trim();
		for (int i = 0; i <= num.length() - 1; i++) {
			int temp = num.charAt(i) - '0';
			if (temp >= 0 && temp < 9)
				result = (result * 10) + temp;
		}
		return result;
	}

}
