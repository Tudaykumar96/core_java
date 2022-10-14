package com.threads.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuterExample {
	public static void main(String[] args) {
		executeThread();
	}

	public static void executeThread() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		//executorservice is an interface which has executors class with different types of static method
		executor.submit(()->{
			String name = Thread.currentThread().getName();
			System.out.println("hello "+ name);
		});
			// here we dont need to create threads manually.executors class has manage internally pool of thread
		// In java process never Stops so we use to stop explicitly !Executors other wise it will listens new tasks.
		//executorservice interface has two methods shutdown() and shutdownNow()
		
		try {
			System.out.println("attemepts to shutdown executor");
			executor.shutdown();//it will waits currently running tasks to finish
			executor.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		}finally {
			if(!executor.isTerminated()) {
				System.err.println("cancel -non finished tasks");
			}
			executor.shutdownNow();
			System.out.println("shutdown finished");
		}
		
		
	}
}
