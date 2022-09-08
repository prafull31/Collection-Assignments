package com.yash.collectionTask8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

import org.w3c.dom.Node;

public class Test {

	public static void main(String[] args) {

		
		ProductionFacility pd1 = new ProductionFacility(001, "Software Developement", "Parbhani", 1,
				new String[] { "Sachin", "ajay", "vijay", "sanjay", "snehal", "yogesh" }, LocalDate.of(2022, 8, 30));
		ProductionFacility pd2 = new ProductionFacility(002, "Software Developement", "pune", 13,
				new String[] { "sohan", "rohan", "mohan", "rajan" }, LocalDate.of(2022, 8, 29));
		ProductionFacility pd3 = new ProductionFacility(003, "Software Developement", "rahuri", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 28));

		
		ProductionFacility pd11 = new ProductionFacility(004, "SAP", "aurangabad", 11, new String[] { "abc", "def" },
				LocalDate.of(2022, 8, 20));
		ProductionFacility pd12 = new ProductionFacility(005, "SAP", "Hingoli", 12,
				new String[] { "mayur", "pranav", "pradip", "prakash", "soham", "prajwal" }, LocalDate.of(2022, 8, 19));
		ProductionFacility pd13 = new ProductionFacility(006, "SAP", "nashik", 13, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 18));

		
		ProductionFacility pd21 = new ProductionFacility(007, "Production", "shegaon", 22,
				new String[] { "Mansi", "Milind" }, LocalDate.of(2022, 8, 10));
		ProductionFacility pd22 = new ProductionFacility(18, "Production", "nagpur", 3, new String[] { "sunny", "banny" },
				LocalDate.of(2022, 8, 9));
		ProductionFacility pd23 = new ProductionFacility(19, "Production", "jalgaon", 14, new String[] { "vizz", "annex" },
				LocalDate.of(2022, 8, 8));

		ArrayList<ProductionFacility> list = new ArrayList<>();
		list.add(pd1);
		list.add(pd2);
		list.add(pd3);

		list.add(pd11);
		list.add(pd12);
		list.add(pd13);

		list.add(pd21);
		list.add(pd22);
		list.add(pd23);

		
		highestProduction(list);
		
		basisOfName(list);

		
		HighestItem(list);

			}

	private static void HighestItem(ArrayList<ProductionFacility> list) {
		HashMap<String, Integer> map = new HashMap<>();
		int length = 0;
		int val = 0;
		String facName = "";
		for (ProductionFacility pf : list) {
			length = pf.getItemnames().length;
			System.out.println("length=" + length);
			if (map.containsKey(pf.getPro_facility_name())) {
				val = map.get(pf.getPro_facility_name());
				if (val > length) {
					map.put(pf.getPro_facility_name(), val);
				} else {
					map.put(pf.getPro_facility_name(), length);
				}
			} else {
				map.put(pf.getPro_facility_name(), length);
			}
		}

		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}

	private static void basisOfName(ArrayList<ProductionFacility> list) {
		Collections.sort(list, new Comparator<ProductionFacility>() {

			@Override
			public int compare(ProductionFacility o1, ProductionFacility o2) {
				String pfName1 = o1.getPro_facility_name();
				String pfName2 = o2.getPro_facility_name();
				return pfName2.compareTo(pfName1);
			}
		});
		System.out.println(list);
	}

	private static void highestProduction(ArrayList<ProductionFacility> list) {
	

	}
}



