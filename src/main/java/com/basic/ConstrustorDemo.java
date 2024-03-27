package com.basic;

/**
 * Static
 * Instance
 * constructor
 * constructor overloading
 * constructor chaining
 * block - Init, static
 */
//static block -> init block -> constructor -> main method -> normal method
public class ConstrustorDemo {
	static {
		System.out.println("static block-2");
	}
	static {
		System.out.println("static block-1");
	}
	
	
	{
		System.out.println("init-1");
	}
	
	{
		System.out.println("init-2");
	}


	ConstrustorDemo(){
		this(10, 20L);
		System.out.println("ConstrustorDemo-1");
	}
	
	
	ConstrustorDemo(int a){
		this(20L, 20);
		System.out.println("ConstrustorDemo-2");
	}
	
	ConstrustorDemo(int a, long b){
		System.out.println("ConstrustorDemo-3");
	}
	
	ConstrustorDemo(long a, int b){
		this();
		System.out.println("ConstrustorDemo-4");
	}
	
	public static void main(String[] args) {

		ConstrustorDemo obj1 = new ConstrustorDemo(100L, 100);
		obj1.show();
		display();

	}
	
	void show() {
		System.out.println("show");
	}
	
	static void display() {
		System.out.println("display");
	}
	
	static {
		System.out.println("static block-3");
	}
	

}
