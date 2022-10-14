package com.threads.syncronizedThreads;

public class Demo {
	public static void main(String[] args) {
		X x = new X();
		x.start();
		x.m1();
		System.out.println("mainThread");
		
	}
}
// A thread holds more than one lock but that has different object.
class X extends Thread{
	
	@Override
	public void run() {
		System.out.println("X childThread");
	}

	synchronized void m1() {

		Y y = new Y();
		y.start();
		y.m2();
		
		System.out.println("m1 method");
	}
}

class Y extends Thread{
	public void run() {
		System.out.println("y childThread");
	}
	synchronized void m2() {
		System.out.println("m2 method");
	}
}
