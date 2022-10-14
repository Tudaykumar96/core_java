package com.oops.revision;

public class InheritanceExample {
	public static void main(String[] args) {
		System.out.println(Parent.class.hashCode());
		System.out.println(Child.class.hashCode());
	}
}
class Parent{
	//global static variables
	static String parentName;
	
	public static void setParentName(String parentName) {
		Parent.parentName = parentName;
	}
	{//static block to initialize the variables and write any implementaion
		System.out.println(parentName);
		System.out.println("static block");
	}
	//static method
	public static void getParentName() {
		System.out.println(parentName);
		System.out.println("static method");
	}
	public static void main(String[] args) {
		Parent.setParentName("parent geroge");
		Parent.getParentName();
	}
}
class Child extends Parent{
	public static void main(String[] args) {
		Child.setParentName("child geroge");
		Child.getParentName();
	}
}