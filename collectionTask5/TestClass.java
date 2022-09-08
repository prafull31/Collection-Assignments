package com.yash.collectionTask5;

import java.util.Collections;
import java.util.Vector;

public class TestClass {

	public static void main(String[] args) {

		Vector<Student> student = new Vector<>();

		student.add(new Student("Bhushan", 86, 1));
		student.add(new Student("Dhananjay", 96, 2));
		student.add(new Student("Yogesh", 99, 4));
		student.add(new Student("Swapnil", 100, 9));
		student.add(new Student("Shashi", 88, 34));

		for (Student s : student)

			System.out.println("Name:" + s.name + "->" + "Marks:" + s.marks + "->" + "ID:" + s.id);

		System.out.println();

		Collections.sort(student);

		for (Student s : student)

			System.out.println("Name:" + s.name + "->" + "Marks:" + s.marks + "->" + "ID:" + s.id);

	}

}
