package com.oops.abstractclasses;

public abstract class Bike {
	Bike() {
		System.out.println("abstract class constructor...");
	}

	abstract void run();

	static int a;

	public static void m(int a) {
		System.out.println("abstract class static method m(int a)");
	}

	public static void main(String[] args) {
		Bike bike = new HondaBike();
		bike.run();
		bike.m(10);// super class m method
		HondaBike.m(100);
		HondaBike.m(60000.50);// child class m method //overloading
	}
}

class HondaBike extends Bike {

	@Override
	void run() {
		System.out.println("implementing method..");
	}

	public static void m(int a) {// overriding
		System.out.println("overriding method m(int a) and the value is :" + a);
	}

	public static void m(double price) {// overloading
		System.out.println("overloading method m(double d)and the price of the bike is : " + price);
	}

}