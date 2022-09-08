package com.yash.collectionTask2;

import java.util.*;

public class BinarySearchOnArray {
	public static void main(String args[]) {
		int numArray[] = { 5, 7, 12, 15, 17, 20, 22, 25 };
		System.out.println("The input array: " + Arrays.toString(numArray));
		
		int key = 17;
		System.out.println("\nKey to be searched=" + key);
		
		int first = 0;
		
		int last = numArray.length - 1;
	
		int mid = (first + last) / 2;
		
		while (first <= last) {
		
			if (numArray[mid] < key) {
				first = mid + 1;
			} else if (numArray[mid] == key) {
				
				System.out.println("Element found at index: " + mid);
				break;
			} else {
				
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Element not found!");
		}
	}
}
