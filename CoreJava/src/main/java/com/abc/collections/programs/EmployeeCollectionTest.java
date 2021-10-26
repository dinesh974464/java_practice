package com.abc.collections.programs;

import java.util.TreeSet;

import com.abc.dataobjects.Employee;

public class EmployeeCollectionTest {

	public static void main(String[] args) {
		
		TreeSet<Employee> t=new TreeSet();
		Employee e1=new Employee(1,"saidinesh",45000);
		Employee e2=new Employee(2,"rohith",50000);
		Employee e3=new Employee(3,"phani",30000);
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee e:t) {
			System.out.println("employee id   "+e.getId()+"employee  name   "+e.getName()+"employee salary   "+e.getSalary());
		}
	} 

}
