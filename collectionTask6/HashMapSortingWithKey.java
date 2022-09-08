package com.yash.collectionTask6;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSortingWithKey {

			static Map<String, Integer> map = new HashMap<>();

			public static void sortbykey()
			{
			TreeMap<String, Integer> sorted
					= new TreeMap<>(map);

				for (Map.Entry<String, Integer> entry :
					sorted.entrySet())
					System.out.println("Key = " + entry.getKey()
									+ ", Value = "
									+ entry.getValue());
			}

			public static void main(String args[])
			{
				map.put("Bhushan", 80);
				map.put("Yash", 90);
				map.put("Prashant", 80);
				map.put("Yogesh", 75);
				map.put("Dhananjay", 40);

				sortbykey();
			}
		}

