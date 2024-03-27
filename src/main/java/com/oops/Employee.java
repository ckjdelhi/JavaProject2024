package com.oops;

/*
 * POJO:
 * 1. all the variables should be Private
 * 2. create default constructor 
 * 3. create parameterized constructor
 * 4. add all getter/setter methods
 * 5. Override toString() method
 */
public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private double salary;
	private String country;
	public Employee() {}
	public Employee(int empId, String name, double salary, String country) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId; //sorting by empID ASC
	}
	
	

}
