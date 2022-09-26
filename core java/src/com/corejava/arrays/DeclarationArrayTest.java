package com.corejava.arrays;

public class DeclarationArrayTest {
	public static void main(String[] args) {
//		int a[] = new int[5];// declaration and instanstaion
//		// initialization
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
		int a[]= {10,20,30,40,50,60};//array initialization with inthe single line
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		//using for each loop rather than for loop to print the values in line by line
		for(int i:a) {
			System.out.println(i);
		}
	}

}
