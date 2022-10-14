package com.threads.multithreading;

public class Yielding {
	public static void main(String[] args) {
		MyThread1 thread = new MyThread1();

		thread.start();
		Thread.yield();// it will waits and proceed next waiting thread if priority is low the it will
						// continuous the execution

		for (int i = 0; i < 5; i++) {
			System.out.println("MainThread");
		}
	}
}

class MyThread1 extends Thread {
	// defining a thread
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("childThread");
		}
	}
}
