package com.threads.syncronizedThreads;

public class DeadThreadExample implements Runnable {
	A a = new A();
	B b = new B();
	
	public DeadThreadExample() throws InterruptedException {
		Thread t = new Thread(this);
		t.start();
		a.firstA(b);
		
	}
	public static void main(String[] args) throws InterruptedException {
		new DeadThreadExample();
	}
	@Override
	public void run() {
		try {
			b.firstB(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class A {
	public synchronized void firstA(B b) throws InterruptedException {
		System.out.println("Thread 1 execution starts");
		Thread.sleep(1000);
		System.out.println("trying to call B class lastB() method");
		b.lastB();
	}

	public  void lastA() {
		System.out.println("A class last() method");
	}
}

class B {
	public static synchronized void firstB(A a) throws InterruptedException {
		System.out.println("Thread2 execution starts");
		Thread.sleep(2000);
		System.out.println("trying to call A class lastA() method");
		a.lastA();
		
	}
	

	public static void lastB() {
		System.out.println("B class last() method");
		
	}

}