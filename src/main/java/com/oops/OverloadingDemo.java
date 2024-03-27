package com.oops;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		OverloadingDemo obj=new OverloadingDemo();
		obj.show(0);
		obj.show(10, 100L);
		

	}
	void show() {	
	}
	void show(int a) {	
	}
	void show(float a) {
		
	}
	
	void show(int a, long b) {
		System.out.println("long");
	}
	
	int show(int a, int b) {
		System.out.println("int");
		return 0;	
	}

}
