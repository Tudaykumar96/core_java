package com.threads.multithreading;

public class ExtendingThread extends Thread {
	public void run() {
		for (int i = 0;i<=5;i++) {
			System.out.println("childThread");
		}
	}
	
}
class ThreadDemo{
	public static void main(String[] args) {
		ExtendingThread t = new ExtendingThread();
		//t.start();
		//when we call start() internally run() will calls otherwise it wont calls and creates a new thread.
		t.run();//it will prints the output as normal method no new thread has been created
		for(int i = 0;i<=5;i++) {
			System.out.println("mainThread");
		}
	}
}
