package com.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int []arr=new int[5];
		arr[0] = 4;
		arr[3] = 3;
		arr[1] = 2;
		arr[4] = 5;
		arr[2] = 1;
		//arr[6] = 1;
		
		
		/*
		 * Print array:
		 * 1. while
		 * 2. do-while
		 * 3. for
		 * 4. forEach
		 */
		System.out.println("Size="+arr.length);//5
		
//		int i=0;
//		while(i<arr.length) {
//			System.out.println(arr[i]);
//			i++;
//		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		String []strArr = {"Hi", "Hello", "Welcome"};
		for(String str: strArr) {
			System.out.println(str);
		}
		
		
	}

}
