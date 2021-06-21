package com.java.problems.Stack;

import java.util.Iterator;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String pattern = new String("{[]()}}");
		boolean result = isValid(pattern);
		System.out.println(result);

	}

	private static boolean isValid(String pattern) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : pattern.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch); // {
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}

		return stack.isEmpty();
	}

}
