package com.java.problems.Dynamic;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = new int[] { 2, 4, 1 };
		int res = maxProfit(prices);
		System.out.println(res);
	}

	public static int maxProfit(int[] prices) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (min > prices[i]) {
				min = prices[i];
			} else {
				max = Math.max(prices[i] - min, max);
			}
		}

		return max;
	}

}
