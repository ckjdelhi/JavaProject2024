package com.oops;

/*
 * Abstraction: showing only essential feature and hiding the complexity 
 * 1. Abstract class (0 to 100%) abstraction
 * 2. Interface (100%) abstraction
 */

/*
 * Abstract class:
 * 1. add 'abstract' keyword to class 
 * 2. Object can't be created for abstract class
 * 3. use inheritance to use abstract class
 * 4. in abstract class, we can have abstract method and non abstract method (concrete method) as well
 * 5. abstract method is a method without body
 */

//75%
abstract class Test {
	//concrete method
	void show() {
		System.out.println("show");
	}
	//abstract method
	abstract void display();
	abstract void insert();
	abstract void delete();
}


public class AbstractionDemo extends Test{

	public static void main(String[] args) {
		//Test obj=new Test();
		AbstractionDemo obj=new AbstractionDemo();
		obj.show();
		obj.delete();
		obj.display();
		obj.insert();

	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}

}
