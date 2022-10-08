package com.oops.working;

public class InstanceMethod {
	int i;
	static int j;
	//global variable we can declare it first if we are not initialize the it will prints default values.
	//we can use directly in the non-static block only 
	//if you are not use with in the static block directly but you can do using object reference variable
	
	{	//it is a non-static block so we can use static and non static variables directly no issue
		int a=1;
		// but in static block we cant use non-static vairables/methods directly must and should use reference;
		System.out.println(a);
		System.out.println(i);
		System.out.println(j+" is a static variable");
		System.out.println("instance block..");
	}
	public void m1() {
		//with in a non static variable we can declare static varibles/methods directly as well;
		int a=10;
		System.out.println(a);
		System.out.println(j+" is a static variable");
		System.out.println(i);
		System.out.println("instance method..");
	}
	public static void main(String[] args) {
		System.out.println("main method...");
		InstanceMethod method = new InstanceMethod();
		System.out.println(method.i+"it is a non - static varibale");
		method.m1();
		int a = 2;
		System.out.println(a);
	}

}
