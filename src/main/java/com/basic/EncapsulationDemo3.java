package com.basic;

import com.oops.EncapsulationDemo;

public class EncapsulationDemo3 extends EncapsulationDemo {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.aPublic);
		//System.out.println(obj.bPrivate);
		//System.out.println(obj.cProtected);
		//System.out.println(obj.dDefault);
		
		EncapsulationDemo3 obj2=new EncapsulationDemo3();
		System.out.println(obj2.aPublic);
		System.out.println(obj2.cProtected);
		//System.out.println(obj2.bPrivate);
		//System.out.println(obj2.dDefault);

	}

}
