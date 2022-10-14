package com.threads.concurrency;

public class ThreadLocalExample {
public static void main(String[] args) {
	CustomerThread c1 = new CustomerThread("cus-thread1");
	CustomerThread c2 = new CustomerThread("cus-thread2");
	CustomerThread c3 = new CustomerThread("cus-thread3");
	CustomerThread c4 = new CustomerThread("cus-thread4");
	c1.start();
	c2.start();
	c3.start();
	c4.start();
}
}
class CustomerThread extends Thread{
	static Integer custId=0;
	private static ThreadLocal l = new ThreadLocal() {

		@Override
		protected Object initialValue() {
			
			return ++custId;
		}
		
	};
	
	public CustomerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing with customerId "+ l.get());
		
	}
	
}
