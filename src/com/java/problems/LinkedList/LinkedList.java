package com.java.problems.LinkedList;

public class LinkedList {
	public Node head;

	public void printLinkedList(Node headNode) {
		Node head = headNode;
		int count = 0;
		while (head != null) {
			if (count == 0) {
				System.out.print(head.data);
				count++;
			} else {
				System.out.print(", " + head.data);
			}
			head = head.next;
		}
	}
}
