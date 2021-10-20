package com.abc.collections.programs;

import com.abc.dataobjects.Student;

public class EqualityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		System.out.println(a == b);

		Student s1 = new Student(1, "dinesh", 45);
		Student s4 = new Student(1, "dinesh", 45);

		System.out.println(s1 == s4);

		System.out.println(s1.equals(s4));

	}

}
