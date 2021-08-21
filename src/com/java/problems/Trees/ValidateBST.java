package com.java.problems.Trees;

public class ValidateBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);

		System.out.println(isValidBST(root));
	}

	public static boolean isValidBST(TreeNode root) {
		boolean res = false;

		recursiveValidation(root, null, null);
		return res;
	}

	private static boolean recursiveValidation(TreeNode root, Integer left, Integer right) {
		if (root == null) {
			return true;
		}
		int val = root.val;

		if (left != null && val <= left)
			return false;
		if (right != null && val >= right)
			return false;

		if (!recursiveValidation(root.left, left, val))
			return false;
		if (!recursiveValidation(root.right, val, right))
			return false;

		return true;
	}

}
