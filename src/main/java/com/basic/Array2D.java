package com.basic;

public class Array2D {

	public int age = 20;
	
	public static void main(String[] args) {
		
		//int[] []arr = new int[4][2];
		int [][]arr = {
				{1,2,3,1}, 
				{32,4,3},
				{3,2},
				{4}
			};
		
		
		for(int i=0; i<arr.length; i++) {//row
			for(int j=0; j<arr[i].length; j++) {//col
				arr[i][j] = (int)(Math.random()* 9);
			}
		}
		
		
		//print
		for(int i=0; i<arr.length; i++) {//row
			for(int j=0; j<arr[i].length; j++) {//col
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int []a: arr) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		

	}

}
