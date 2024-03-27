package com.basic;

public class Demo {
	
	public Demo(){
		this("hi");
		System.out.println("1");
	}
	public Demo(int a){
		this();
		System.out.println("2");
	}
	public Demo(String s){
		System.out.println("3");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		
		Demo o1=new Demo(10);
	}

}
