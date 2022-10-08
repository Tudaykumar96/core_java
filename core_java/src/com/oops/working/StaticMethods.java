package com.oops.working;

public class StaticMethods {
	// global variable-static variable
	// static gloabal variables are having default values.
	// we can use accross any where in the class
	// it should follows the order for datamember as first if u are printing in
	// static block
	static String name;
	// static block will be executed at the time of class loading.

	public static int m1() {
		System.out.println(name);
		System.out.println("static method....");
		return 10;
	}

	static {
		System.out.println("aaaa");

//		int m = m1();
//		System.out.println("method call "+ m);
//		
		System.out.println("static block.." + name);

	}

	public static void main(String[] args) {
		System.out.println("mainmethod " + name);
//		
		System.out.println("main method");

	}

}
