package com.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	String str;
	public static void main(String[] args) throws IOException, AgeInvalidException {
		
		int age = 15/0;
		if(age<18) {
			throw new AgeInvalidException("Your age is not valid... allowed only 18+");
		}
		/*
		 Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.exception.ExceptionDemo.main(ExceptionDemo.java:11)
 
		 
		 Exception in thread "main" com.exception.AgeInvalidException: Your age is not valid... allowed only 18+
			at com.exception.ExceptionDemo.main(ExceptionDemo.java:13)

		 */
		
		
		
//		System.out.println("Hello");
//		ExceptionDemo obj=new ExceptionDemo();
//		
//		//if(obj.str !=null) {
//			try {
//				System.out.println(obj.str.length());
//			} catch (Exception e) {
//				//e.printStackTrace();
//			}
//		//}
//		System.out.println("End");
//		
		File file=new File("abc.txt");
		file.createNewFile();
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Two numbers:");
//		int a = sc.nextInt(); //InputMismatchException
//		int b = sc.nextInt();
//		if(b != 0)
//			System.out.println("Div="+(a/b)); //ArthemeticExcpetion
//		else
//			System.out.println("Invalid 2nd Input");
//		sc.close();
		
//		String s ="abc"; //NumberFormatException
//		String s2 ="56";
//		//int val = Integer.parseInt(s);
//		//System.out.println(val);
//		System.out.println(Integer.parseInt(s) + Integer.parseInt(s2)); //12356  => 179

//		int []ar=new int[5];
//		System.out.println(ar[10]);//ArrayIndexOutOfBoundsException

		try {
			String s="abc";
			System.out.println(s.charAt(2)); //StringIndexOutOfBoundsException
			//System.exit(0);
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
	}

}
