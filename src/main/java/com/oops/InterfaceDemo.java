package com.oops;

interface BTest {
	int a = 5;
	void insert();
}

interface ITest extends BTest{
	
	default int delete() {
		return 10;
	}
	
	static void hello() {
		System.out.println("hi");
	}
	
	void show();
	void display();  // public abstract void display();
	
}


public class InterfaceDemo implements ITest {

	public static void main(String[] args) {
		
		BTest obj=new InterfaceDemo();
		System.out.println(obj.a);
		//obj.a = 40;
		//obj.show();
		//obj.display();
		obj.insert();
		
		ITest obj2=new InterfaceDemo();
		obj2.delete();
		
		ITest.hello();
		
		

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

}
