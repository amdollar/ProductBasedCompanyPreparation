package com.java.problems.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		LinkedList ls1 = new LinkedList();
		ls1.head = new Node(2);
		Node node2 = new Node(4);
		ls1.head.next = node2;
		Node node3 = new Node(3);
		node2.next = node3;
		/*
		 * Node node4 = new Node(4); node3.next = node4;
		 */ ls1.printLinkedList(ls1.head);

		System.out.println("");
		LinkedList ls2 = new LinkedList();
		ls2.head = new Node(5);
		Node node22 = new Node(6);
		ls2.head.next = node22;
		Node node32 = new Node(4);
		node22.next = node32;
		ls1.printLinkedList(ls2.head);
		Node result = addTwoNumbers(ls1, ls2);
		System.out.println("");
		ls1.printLinkedList(result);
	}

	private static Node addTwoNumbers(LinkedList ls1, LinkedList ls2) {
		
		Node leftHead = ls1.head;
		Node rightHead = ls2.head;
		Node resultHeadNode = null;
		int carry = 0;
		while ((leftHead != null || rightHead != null) || carry > 0) {
			int leftData = 0;
			int rightData = 0;
			int sum = carry;
			if (leftHead != null) {
				leftData = leftHead.data;
				sum += leftData;
				leftHead = leftHead.next;
			}
			if (rightHead != null) {
				rightData = rightHead.data;
				sum += rightData;
				rightHead = rightHead.next;
			}
			if (sum > 0) {
				Node ptr = null;
				Node node = null;
				if (carry > 0) {
					node = new Node(carry);
					carry = 0;
				}
				if (sum > 9) {
					int data = sum % 10;
					carry = sum / 10;
					node = new Node(data);
				} else {
					node = new Node(sum);
				}
				if (resultHeadNode == null) {
					resultHeadNode = node;
				} else {
					ptr = resultHeadNode;
					while (ptr.next != null) {
						ptr = ptr.next;
					}
					ptr.next = node;
				}
				sum = 0;
			}
		}
		return resultHeadNode;
	}

}
