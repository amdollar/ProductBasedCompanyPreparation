package com.java.problems.Misc;

public class StepsToZero {

	public static void main(String[] args) {
		int num = 123;
		System.out.println(numberOfSteps(num));
	}

	public static int numberOfSteps(int num) {
		int count = 0;
		while (num > 0) {
			if (num % 2 == 0) {
				num = divide(num);
				count++;
			} else {
				num = subtract(num);
				count++;
			}
		}
		return count;
	}

	public static int subtract(int num) {
		return --num;
	}

	public static int divide(int num) {
		return num / 2;
	}

}
