package com.abc.dataobjects;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
}
	public int compareTo(Employee other) {
		Integer Salary1=this.getSalary();
		Integer Salary2=other.getSalary();
		return Salary1.compareTo(Salary2);
	}
	
	
	}
