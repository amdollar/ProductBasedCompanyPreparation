package com.java.problems.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
import java.util.Iterator;
import java.util.Stack;

public class AdjacentDuplicates {

	public static void main(String[] args) {
		String str = new String("azxxzy");
		String result = removeDuplicates(str);
		System.out.println("Before: " + str);
		System.out.println("After: " + result);
	}

	private static String removeDuplicates(String str) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == ch) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		Iterator<Character> it = stack.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
		}
		return sb.toString();
	}

}
