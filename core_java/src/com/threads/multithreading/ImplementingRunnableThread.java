package com.threads.multithreading;

public class ImplementingRunnableThread {
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		//let us assume that few of the cases so we can declare one more thread empty object
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		//t1.start();//creates a new thread
		//t1.run();//no new thread created and run() also will not execute prints only main thread 
		//t2.start();//it will creates a new thread and runnable run() will excutes.
		//t2.run();//no new thread createad myrunnbale run() will calls normally
		//r.start();// no start() is available
		r.run();//no new thread created just calls myrunnable run() .
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}
}

 class MyRunnable implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}
}
// IN this case also we cant expect exact output