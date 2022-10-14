package com.threads.multithreading;

public class JoinThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 thread = new MyThread2();
		thread.start();
		thread.join();//waits untill the another thread gets complete its execution
		System.out.println("mainThread");
	}
}

class MyThread2 extends Thread {
	// defining a thread
	public void run() {

		System.out.println("childThread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
