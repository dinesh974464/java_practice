package com.abc.collections.programs;

import java.util.HashSet;

import com.abc.dataobjects.Student;

// Hashset does not allow duplicate objects.  
// Data is stored in buckets. Each bucket can have multiple objects.
// Hashcode value is used to identify the bucket
// Objects equality(or Duplication) is checked using equals() method.
// Two equal objects always have same hashcode value because hashcode is calcuated based on the content.
// when object is being added to hashset, it first calls the hashCode() to identify the bucket and then calls equals() to check the equality/dulication in the bucket.
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
