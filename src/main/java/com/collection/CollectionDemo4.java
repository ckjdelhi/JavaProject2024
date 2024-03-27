package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.oops.Employee;

/*
 * Default sorting: Comparable Interface
 * Custom sorting: Comparator Interface
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(20, "Ram", 2000, "India"));
		list.add(new Employee(21, "Mohan", 2000, "US"));
		list.add(new Employee(19, "Ramesh", 2000, "UK"));
		list.add(new Employee(18, "Chandan", 2000, "India"));
		list.add(new Employee(25, "Rakesh", 2000, "Nepal"));
		list.forEach(obj-> System.out.println(obj.getEmpId() +"\t"+obj.getName()+"\t"+obj.getCountry()));
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Afer softing by ID-------");
		list.forEach(obj-> System.out.println(obj.getEmpId() +"\t"+obj.getName()+"\t"+obj.getCountry()));
		
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		
		System.out.println("Afer softing by Name-------");
		list.forEach(obj-> System.out.println(obj.getEmpId() +"\t"+obj.getName()+"\t"+obj.getCountry()));
		
		System.out.println("Afer softing by Country-------");
		list.stream().sorted((o1, o2)->o1.getCountry().compareToIgnoreCase(o2.getCountry()))
					 .forEach(obj-> System.out.println(obj.getEmpId() +"\t"+obj.getName()+"\t"+obj.getCountry()));
		

	}

}
