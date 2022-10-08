package com.oops.working;


public class ConstructorCalling {
	private int no;
	private  String name;
	private  int age;
	
	public ConstructorCalling(int no) {
		//this("yamal",12);
		this.no = no;
	}
	public ConstructorCalling(String name, int age) {
		this(1324);
		this.age = age;
		this.name = name;
	}
	public ConstructorCalling(int no, String name, int age) {
		this(name,age);
		this.no = no;
	}
	public ConstructorCalling() {
		
		System.out.println("default constructor");
	}
	
	@Override
	public String toString() {
		return "ConstructorCalling [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		ConstructorCalling calling = new ConstructorCalling();
		ConstructorCalling calling1 = new ConstructorCalling(1);
		System.out.println(calling1);
		ConstructorCalling calling2 = new ConstructorCalling("robot",23);
		System.out.println(calling2);
		ConstructorCalling calling3 = new ConstructorCalling(2,"kumar",29);
		System.out.println(calling3);
		
		
	}

}
