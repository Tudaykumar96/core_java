package com.threads.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock2Example {
	public static void main(String[] args) {
		MyThreadd t1 = new MyThreadd("firstThread");
		MyThreadd t2 = new MyThreadd("SecondThread");
		t1.start();
		t2.start();

	}

}

class MyThreadd extends Thread {

	public MyThreadd(String name) {
		super(name);
	}

	static ReentrantLock l = new ReentrantLock();

	@Override
	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + ": safe operation");

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + ": alternative operations");
		}

	}

}
