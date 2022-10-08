package com.oops.interfaces;

interface Left {
	void m1();

	// int m2();
	int x = 888;
}

interface Right {
	void m1();

	void m1(int a);

	// double m2();
	int x = 999;
}

class InterfaceTest implements Left, Right {
	public static void main(String[] args) {
		InterfaceTest test = new InterfaceTest();
		test.m1();
		test.m1(10);
		// System.out.println(x);//un resolved compilation so
		System.out.println(Left.x);
		System.out.println(Right.x);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("overriding concept one method is enough because two interfaces are having same method");
	}

	@Override
	public void m1(int a) {
		// TODO Auto-generated method stub
		System.out.println("overloading concept two interfaces are having same method name but different arguments");

	}
	/*
	 * @Override public int m2() { // TODO Auto-generated method stub return 0; }
	 */ // this type of different return type methods are not overridden simantaniously.

}