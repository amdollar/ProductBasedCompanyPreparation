package com.java.problems.Stack;

import java.util.ArrayList;
import java.util.List;

public class BTInorder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
//		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(2);
		root.right = right;
//		TreeNode node = new TreeNode(4);
//		TreeNode node2 = new TreeNode(5);
//		root.left = left;
		root.right.left = new TreeNode(3);
//		root.right = right;
//		left.left = node;
//		node.left = node2;

		List<Integer> result = inorderTraversal(root);
		result.stream().forEach(System.out::println);

	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root != null) {
			if (root.left != null)
				inorderTraversal(root.left);
			result.add(root.val);
			if (root.right != null)
				inorderTraversal(root.right);
		}
		return result;
	}

}
