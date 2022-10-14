package com.oops.revision;

public class OverloadingExample {
	public static void main(String[] args) {

		Parent1 p = new Child1();
		p.getParentInfo("james");

		Child1 c = new Child1();
		c.getParentInfo("james markaerm", 80);
		
		c.NormalMethod(10);
	}
}

//while overloading static methods are supported
//while overriding static methods can't be supported
class Parent1 {
	public static void getParentInfo(String name) {
		System.out.println("name is :" + name);
		
	}
	public void NormalMethod(int a) {
		System.out.println("parent normal method");
	}
}

class Child1 extends Parent1 {
	public static void getParentInfo(String name, int age) {
		System.out.println("name is :" + name + "," + "age is : " + age);
		
	}

	@Override
	public void NormalMethod(int a) {
		
		super.NormalMethod(a);
		System.out.println("child normal method");
	}
	
}
