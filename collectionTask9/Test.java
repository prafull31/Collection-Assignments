package com.yash.collectionTask9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(101, "Prafull", 15000, "", "devloper");
		Employee employee2 = new Employee(103, "prashant", 25000, "devloper", "satara");
		Employee employee3 = new Employee(102, "pranil", 35000, "engineer", "pune");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
