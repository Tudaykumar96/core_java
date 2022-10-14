package com.threads.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread0 t1 = new MyThread0(d, "dhoni");
		MyThread0 t2 = new MyThread0(d, "yuvi");
		t1.start();
		t2.start();
	}
}

class Display {
	 ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();
		for (int i = 0; i <= 10; i++) {
			System.out.print("GoodMorning : ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		l.unlock();
	}
}

class MyThread0 extends Thread {
	Display d;
	String name;

	public MyThread0(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}

}
