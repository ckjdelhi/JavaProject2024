package com.basic;

/**
 * Class:
 * 	Data member/ Variable/ State/Properties
 * 	Member function / method /behavior
 * 
 * Static type: is class level member
 * Instance type: is object level member
 */
public class StaticDemo {
	
	 //instance
	 int a =10;
	 
	 //static 
	 static int b =10;

	public static void main(String[] args) {
		//System.out.println(b);
		
		StaticDemo obj1=new StaticDemo();
		System.out.println(obj1.a);//10
		obj1.a =20;
		obj1.b =20;
		
		StaticDemo obj2=new StaticDemo();
		System.out.println(obj2.a);//10
		obj2.a =30;
		obj2.b =40;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println(obj1.b);//40
		System.out.println(obj2.b);//40
		
	}
	
	void show() {
		//int a =10;
		System.out.println(a);
		System.out.println(b);
	}

}
