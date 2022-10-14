package com.threads.multithreading;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i <= n; i++) {
			//MultiThreadingExample thread = new MultiThreadingExample();//direct thread object creation
			MultiThreadingExampleRunnable runnable = new MultiThreadingExampleRunnable();
			Thread thread = new Thread(runnable);
			// in runnable interface no start() available so we need to manually
			// create a thread object and pass runnable reference object
			thread.start();
		}
	}
}

//it will prints improper threads with different order
class MultiThreadingExampleRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");

	}

}
//it will prints improper threads with different order
class MultiThreadingExample extends Thread {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}

}
