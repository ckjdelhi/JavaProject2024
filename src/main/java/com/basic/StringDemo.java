package com.basic;

public class StringDemo {

	public static void main(String[] args) {
//		String s1="abc";  //string literal
//		String s2 = new String("abc");//String object
//		String s3="abc";  //string literal
//		String s4=new String("abc");//String object
//		
//		
//		System.out.println(s1 == s3); //true
//		System.out.println(s2.equals(s4)); //false
		
		//compare content
		String str1="a";
		String str2="A";
		
		String str3 = str1 + str2;//aA
		String str4 = str1.concat(str2);//aA
		
		StringBuilder sb= new StringBuilder();
		sb.append("A");
		sb.append("A");
		sb.append("A");
		sb.append("A");
		System.out.println(sb.toString());
		
		
		
		System.out.println(str1.toUpperCase().equals(str2.toUpperCase()));//false
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		String s1 ="Hi Welcome to Java";
	
		System.out.println(s1.substring(3));//Welcome to Java
		System.out.println(s1.substring(s1.indexOf("W"), s1.indexOf("to")));//Welcome
		System.out.println(s1.charAt(3));//W
		System.out.println(s1.indexOf("W"));//3
		
		
		System.out.println(s1.length());//18
		System.out.println(s1.toUpperCase()); //HI WELCOME TO JAVA
		System.out.println(s1.toLowerCase()); //hi welcome to java
		
		System.out.println("He\\she can\tdo\n\rthis"); // He\she can do this
		
		
		String s2="         Hi          ";
		System.out.println(s2.trim().length());//21 => 2
		System.out.println(s2.replaceAll("Hi", "Welcome"));
		
		String s3 ="Hi Welcome to Java";
		System.out.println(s3.split(" ").length);
		
	}

}
