package com.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		MyRunnable[] r = { new MyRunnable("durga"), new MyRunnable("champ"), new MyRunnable("ravi"),
				new MyRunnable("jadav"), new MyRunnable("sharma"), new MyRunnable("vishnyu") };
		for (MyRunnable jobs : r) {
			service.submit(jobs);
		}
		service.shutdown();
	}
}

class MyRunnable implements Runnable {
	String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " jobStarted " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " jobcompletes" + Thread.currentThread().getName());
	}

}