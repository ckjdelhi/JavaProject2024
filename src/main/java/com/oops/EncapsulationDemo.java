package com.oops;

/*
 * Access Modifiers:
 * 1. public : accessible everywhere
 * 2. private: accessible same class only
 * 3. protected: accessible same class, within same package, in another package using inheritance 
 * 4. default: accessible same class, within same package
 */
public class EncapsulationDemo {

	public int aPublic = 5; //ALT+SHIFT+R
	private int bPrivate = 5;
	protected int cProtected = 5;
	int dDefault = 5; //default
			
	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.aPublic);
		System.out.println(obj.bPrivate);
		System.out.println(obj.cProtected);
		System.out.println(obj.dDefault);
		

	}

}
