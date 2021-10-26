package com.abc.collections.programs;

import java.util.HashSet;
import java.util.Iterator;

import com.abc.dataobjects.Student;

public class StudentCollection {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"dinesh",45);
		Student s2=new Student(1,"sowmya",46);
		Student s3=new Student(1,"rohith",47);
		
		HashSet<Student> h=new HashSet<Student>();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		
		Iterator<Student> itr=h.iterator();
		System.out.println(h);
	}
}
