package com.java.problems.Stack;

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		String path = new String("/a/../../b/../c//.//");
		String simplifiedPath = simplifyPath(path);
		System.out.println(simplifiedPath);
	}

	private static String simplifyPath(String path) {
		Stack<Character> data = new Stack<Character>();
		StringBuilder result = new StringBuilder();
		for (Character ch : path.toCharArray()) {
			if ((!data.isEmpty() && ch == '/' && data.peek() == '/')) {
				;
			} else if (ch == '.') {
				data = new Stack();
			} else {
				data.push(ch);
			}
		}
		while (!data.isEmpty()) {
			result.append(data.pop());
		}
		String resu = result.reverse().toString();
		if (resu.length() != 1 && resu.charAt(resu.length() - 1) == '/') {
			resu = resu.substring(0, (resu.length() - 1));
		}
		return resu;
	}

}
