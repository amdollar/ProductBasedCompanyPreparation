package com.java.problems.Dynamic;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		int arr[] = new int [] {2,2,1};
		int re  = findSingle(arr);
		System.out.println(re);
	}

	private static int findSingle(int[] arr) {
		// TODO Auto-generated method stub
		int res = 0;
		Set<Integer> data = new HashSet<>();
		for(int i: arr) {
			if(!data.add(i)) {
				return i;
			}
		}
		return res;
	}

}
