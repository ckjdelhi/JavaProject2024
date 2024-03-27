package com.oops;

import com.basic.Array2D;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(100);
		e1.setName("Chandan");
		e1.setSalary(5000);
		e1.setCountry("India");
		
		
		String s=new String("Hi");
		System.out.println(s);

		Employee e2=new Employee(101, "Ram", 100, "US");
		System.out.println(e2);
		
		
		Array2D o=new Array2D();
		System.out.println(o.age);
		
	}

}
