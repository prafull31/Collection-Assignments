package com.yash.CollectionTask1;

import java.util.*;

public class SortingAscendingOrder {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("prafull");
		al.add("prashant");
		al.add("bhushan");
		al.add("nikhil");

		Collections.sort(al);

		System.out.println("List After Sorting :- " + "\n" + al);
	}
}
