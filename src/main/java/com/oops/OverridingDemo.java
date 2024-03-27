package com.oops;


class AnotherClass {
	void show() {
		System.out.println("Another class show");
	}
	void display() {
		System.out.println("Another class display");
	}
}


public class OverridingDemo extends AnotherClass{

	public static void main(String[] args) {
		OverridingDemo obj = new OverridingDemo();
		obj.show();
		obj.display();
		obj.display(100);
		
		
		long b = 999999999;
		
		int a = (int) b;
		System.out.println(a);
		
		
		
		
		AnotherClass obj2 = new AnotherClass();
		obj2.show(); //Another class show
		obj2.display(); //Another class display
		
		AnotherClass obj3=new OverridingDemo();
		obj3.show();//Child class show
		obj3.display(); //Another class display
		//obj3.display(100);
		
		
		//will not work
//		OverridingDemo obj4=(OverridingDemo)new AnotherClass();
//		obj4.show();
//		obj4.display();
//		obj4.display(100);
		
		
	}
	
	@Override
	void show() {
		System.out.println("Child class show");
	}
	
	void display(int a) {
		System.out.println("Child class display with param");
	}

}
