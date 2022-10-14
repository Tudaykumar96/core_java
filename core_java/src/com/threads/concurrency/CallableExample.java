package com.threads.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] callable = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable callables : callable) {
			Future f = service.submit(callables);
			System.out.println(f.get());
		}
		service.shutdown();
	}

}

class MyCallable implements Callable {
	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + " is the responsible to find sum of first" + num + "numbers");
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
