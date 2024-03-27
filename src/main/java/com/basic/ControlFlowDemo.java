package com.basic;

import java.util.Scanner;

/*
 * Control Flow:
 * 1. If-else
 * 2. switch
 * 
 * Loops:
 * 1. While
 * 2. Do-while
 * 3. For loop
 * 4. For Each
 */

public class ControlFlowDemo {

	public static void main(String[] args) {
		
		ControlFlowDemo obj = new ControlFlowDemo();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1. Select");
		System.out.println("2. Edit");
		System.out.println("3. Delete");
		System.out.println("4. Fetch");
		System.out.println("5. Fetch ALL");
		
		System.out.println("Choose any one option:");
		int a = sc.nextInt();
		switch(a) {
			case 1:
				System.out.println("Option 1 selected");
				System.out.println("Selection operation");
				break;
			case 2:
				System.out.println("Option 2 selected");
				System.out.println("Selection operation");
				//break;
				
			case 3:
				System.out.println("Option 3 selected");
				System.out.println("Selection operation");
				//break;
				
			case 4:
				System.out.println("Option 4 selected");
				System.out.println("Selection operation");
				break;
			case 5:
				System.out.println("Option 5 selected");
				System.out.println("Selection operation");
				break;
			default:
				System.out.println("Wrong option selected");
				break;
			
		}
		
		sc.close();
	}
	
	int show() {
		return 10;
	}

}
