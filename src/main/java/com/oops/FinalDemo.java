package com.oops;

/**
 * Final: Non access modifier
 * 1. class:  cannot subclass the final class (can't extends)
 * 2. method: Cannot override the final method (can't override)
 * 3. variable: The final field cannot be assigned (can't modify)
 */

//Ex- String
class FinaTest {
	final int a;
	public FinaTest(int a) {
		this.a = a;
	}
	final void show() {
		System.out.println("hi");
	}
	
	void display() {
		System.out.println("hi");
	}
}


public class FinalDemo {

	public static void main(String[] args) {
		FinaTest obj = new FinaTest(10);
		//obj.a = 20;
		System.out.println(obj.a);
		obj.show();

	}

//	void show() {
//		System.out.println("display");
//	}
}
