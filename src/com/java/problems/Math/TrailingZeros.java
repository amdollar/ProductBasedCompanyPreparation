package com.java.problems.Math;

public class TrailingZeros {
	public static void main(String[] args) {
		int num = 20;
		int trailingZeros = findTrailingZeros(num);
		int magicFact = findTrailingZerosMagically(num);
		System.out.println(trailingZeros);
		System.out.println(magicFact);
	}

	private static int findTrailingZerosMagically(int n) {
// on every 25 one extra 5 is coming, we need to remove this by 
		// dividing it by 5 then 25 and then by 125

		int totalFives = 0;
		for (int i = 5; n / i >= 1; i *= 5) {
			totalFives += n / i;
		}

		return totalFives;
	}

	private static int findTrailingZeros(int num) {
		int result = 0;
		long factorial = factorial(num);
		System.out.println(factorial);
		long leftOut = factorial % 10;
		while (leftOut == 0) {
			result++;
			factorial = factorial / 10;
			leftOut = factorial % 10;
		}

		return result;
	}

	private static int factorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num * factorial(num - 1);
	}
}
