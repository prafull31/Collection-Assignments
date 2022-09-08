package com.yash.collectionTask4;

import java.util.ArrayList;

public class RemoveDuplicatesNames {
	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<String>();
		    al.add("AB");
		    al.add("ABC");
		    al.add("ABCD");
		    al.add("ABCD");
		    al.add("ABCDE");

		    System.out.println("Duplicates List "+al);

		    Object[] st = al.toArray();
		      for (Object s : st) {     
		        if (al.indexOf(s) != al.lastIndexOf(s)) {
		            al.remove(al.lastIndexOf(s));
		         }
		      }

		    System.out.println("Distinct List "+al);
	}
}
