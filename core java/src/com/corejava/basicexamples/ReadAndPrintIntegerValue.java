package com.corejava.basicexamples;

import java.util.Scanner;

public class ReadAndPrintIntegerValue {

	public static void main(String[] args) {
		//declare variable
		int num ;
		// input the integer
		System.out.println("enter integer:");
		//create scanner
		Scanner sc = new Scanner(System.in);
		//read the next integer form the screen
		num = sc.nextInt();
		//display the integer
		System.out.println("Entered integer is : "+num);
		

	}

}
