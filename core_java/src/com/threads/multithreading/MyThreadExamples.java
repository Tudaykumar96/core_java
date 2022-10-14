package com.threads.multithreading;

public class MyThreadExamples extends Thread {
	// with out run() in this case no matter of going to multithreading concept so
	// must and should override run().
	public void run() {
		System.out.println("no arg method");
	}

	// In this case we need to call explicitly overloading run() method otherwise it
	// will calls default run() in thread class.
	public void run(int i) {
		System.out.println("one arg method");
	}

	// if your are not calling any start() in main() then it will not calls any
	// method
	// if we call start() it will not creates a new thread it will calls just normal
	// method.
	public void start() {
		super.start();// A new thread will be creating by calling super.start() in normal start().
		System.out.println("start method");
	}
}

class Demo {
	public static void main(String[] args) {
		MyThreadExamples t = new MyThreadExamples();
		t.start();// it will calls only thread class run method.
		//dont call on same thread.
		//t.start();//it will throws an runtime exception "IllegalThreadStateException".
		System.out.println("mainThread");
	}
}
