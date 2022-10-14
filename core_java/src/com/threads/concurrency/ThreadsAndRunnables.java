package com.threads.concurrency;

import java.util.concurrent.TimeUnit;

public class ThreadsAndRunnables {
	public static void main(String[] args) {
		findThreadName();
	}
	public static  void findThreadName() {
		Runnable r = ()->{
			String name = Thread.currentThread().getName();
			
			try {
				System.out.println("foo "+ name);
				// it is a concurrent thread method for waiting a thread or we can use Thread.sleep()
				TimeUnit.SECONDS.sleep(10);
				System.out.println("bar "+ name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		r.run();//it will calls main method
		Thread t = new Thread(r);
		t.start();//it will calls Thread starts
		System.out.println("Done");
	}

}
