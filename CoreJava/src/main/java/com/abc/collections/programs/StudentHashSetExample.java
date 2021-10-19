package com.abc.collections.programs;

import java.util.HashSet;

import com.abc.dataobjects.Student;

// Hashset does not allow duplicate objects.  Objects equality(or Duplication) is checked using equals() method.
// Data is stored in buckets. Each bucket can have multiple objects.
// Hashcode value is used to identify the bucket.
// when object is added to hashset, bucket is found first with the hashcode value. If bucket is not empty then equality is checked.
// Two equal objects always have same hashcode value. Because hashcode is calcuated based on the content.
public class StudentHashSetExample {

	public static void main(String[] args) {

		Student s1 = new Student(1, "dinesh", 45);
		Student s2 = new Student(1, "sowmya", 46);
		Student s3 = new Student(1, "rohith", 47);
		Student s4 = new Student(1, "dinesh", 45);

		HashSet<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		for (Student s : students) {
			System.out.println(s);
		}

	}
}
