package com.company;

public class BinarySearch {
	
	//The ranking method
	public static int rank(int key, int[] a) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (key < a[mid])
				high = mid - 1;
			else if (key > a[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
/*
		int[] whitelist = System.in.read(args[0]);
		Arrays.sort(whitelist);
		while (!.isEmpty()) {
			int key = StdIn.readInt();
			if (rank(key, whitelist) == -1) {
				StdOut.println(key);
			}
		}
*/
	}
}
