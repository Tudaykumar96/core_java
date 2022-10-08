package com.Exception.uncheckedExceptions;

public class ClassCastExceptionTest {
	public static void main(String[] args) {
		parent p = new parent();
		child c = new child();
		parent p1 = new child();
		child c1 = (child) new parent();
	}
}
class parent{
	public void m1() {
		System.out.println("parent");
	}
}
class child extends parent{
	public void m1() {
		System.out.println("child");
	}
	
}