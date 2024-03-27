package com.basic;

/*
 * 0(low) or 1(high) = 1 bit
 * 8 bits = 1 byte
 * 1024 bytes = 1 KB
 * 1024 KB = 1 MB
 * 1024 MB = 1 GB
 */


/**
 * Primitive(8 types): fixed size
 * 1. boolean (1 bit) : true/false
 * 
 * Integer:
 * 2. byte (1 byte)
 * 3. short(2 byte)
 * 4. int  (4 byte)
 * 5. long (8 byte)
 * 
 * Floating point
 * 6. float (4 byte)
 * 7. double(8 byte)
 * 
 * 8. char (2 byte)
 * 
 * Non-Primitive: Array, String, ...
 */

public class DataTypesDemo {

	int i =10;
	long l = 10;
	public static void main(String[] args) {
		DataTypesDemo o1=new DataTypesDemo();//4+8 = 12 bytes
		DataTypesDemo o2=new DataTypesDemo();//4+8 = 12 bytes
		DataTypesDemo o3=new DataTypesDemo();//4+8 = 12 bytes
		DataTypesDemo o4=new DataTypesDemo();//4+8 = 12 bytes
		
	}

}
