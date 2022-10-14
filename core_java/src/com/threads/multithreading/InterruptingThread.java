package com.threads.multithreading;

public class InterruptingThread {
	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start();
		thread.interrupt();// interrupt() will interrupts the child thread untill mainthread process
		for (int i = 0; i <= 5; i++) {

			System.out.println("mainThread execution");
		}
		// when we are not calling any waiting or sleeping methods. first chance
		// mainthread got executed and next child thread
		// if we call any sleeping or waiting method based on method threads got
		// executed.
	}

}

class MyThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("childThread is lazy thread");
		}
		// if sleep methods are not part of child thread then mainthread will gets
		// interrupts childthread. childthread gets complete execution
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
			System.out.println("get interrupted..");
		}

	}
}
