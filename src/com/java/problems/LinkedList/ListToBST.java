package com.java.problems.LinkedList;

import com.java.problems.Trees.TreeNode;

public class ListToBST {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Node headNode = new Node(-10);
		Node firstNode = new Node(-3);
		headNode.next = firstNode;
		Node secondNode = new Node(0);
		firstNode.next = secondNode;

		Node thirdNode = new Node(5);
		secondNode.next = thirdNode;

		Node forthNode = new Node(9);
		thirdNode.next = forthNode;

		ll.printLinkedList(headNode);
		TreeNode root = sortedListToBST(headNode);
		printBST(root);
	}

	public static void printBST(TreeNode root) {
		if (root == null)
			return;
		printBST(root.left);
		System.out.println(root.val);
		printBST(root.right);
	}

	public static TreeNode sortedListToBST(Node head) {
		if (head == null)
			return null;
		if (head.next == null)
			return new TreeNode(head.data);
		// We first need to identify the middle element of the given head list.
		Node fast = head.next, slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node midNode = slow.next;
		// need to make this mid node as null for left subtree.
		slow.next = null;
		TreeNode root = new TreeNode(midNode.data);
		root.left = sortedListToBST(head);
		root.right = sortedListToBST(midNode.next);

		return root;
	}
}
