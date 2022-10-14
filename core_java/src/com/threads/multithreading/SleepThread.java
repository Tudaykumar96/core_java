package com.threads.multithreading;

public class SleepThread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");
		Thread.sleep(1000);// we can manage the output by our own time when it gets executed
		System.out.println("how");
		Thread.sleep(1000);
		System.out.println("are");
		Thread.sleep(1000);
		System.out.println("you");
		
	}

}
