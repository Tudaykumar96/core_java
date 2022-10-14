package com.threads.syncronizedThreads;

public class SyncronizedExample {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		//Display d2 = new Display();// if u are using different objects then it will gets irregualr output.
		MyThread t1 = new MyThread(d1, "dhoni");
		MyThread t2 = new MyThread(d1, "yuvi");
		t1.start();
		t2.start();

	}
	
}

class MyThread extends Thread {
	Display d;
	String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}

}

class Display {
	
	
	// if we are not calling syncronized keyword onthe method threads will executes
	// in proper way so to avoid and prints normal way we should use syncronized
	// keyword onthe method.
	public synchronized void wish(String name) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("good morning");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
	
	
}