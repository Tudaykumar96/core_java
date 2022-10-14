package com.threads.multithreading;

public class ThreadPriority {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
//		System.out.println(thread.getName());//prints the default name is Thread-0
//		//so to set the our own name to current thread
//		Thread.currentThread().setName("parivar");
//		System.out.println(Thread.currentThread().getName());//parivar
//		
//		System.out.println(thread.getId());
		
		//getting and setting priority
//		System.out.println(thread.getPriority());//it will prints the default priority is 5
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());//10
		//thread.setPriority(10);
		thread.start();
		System.out.println("MainThread");
		//highest priority will prints first
		
	}
}
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("childThread");
		}
	}
	
}
