package com.threads.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLockExample {
	public static void main(String[] args) {
		MyThread11 t1 = new MyThread11("firstThread");
		MyThread11 t2 = new MyThread11("secondThread");
		t1.start();
		t2.start();
	}
}

class MyThread11 extends Thread {

	public MyThread11(String name) {
		super(name);
	}

	static ReentrantLock l = new ReentrantLock();

	public void run() {
		do {
				try {
					if (l.tryLock(5, TimeUnit.SECONDS)) {
						System.out.println(Thread.currentThread().getName() + "--" + "got locked");
						Thread.sleep(30000);
						l.unlock();
						System.out.println(Thread.currentThread().getName() + "--" + "lock released");
						break;
					} else {
						System.out.println(Thread.currentThread().getName() + "--" + "not executed will try again");
					}
				} catch (InterruptedException e) {
				}
			
		} while (true);
	}
}
