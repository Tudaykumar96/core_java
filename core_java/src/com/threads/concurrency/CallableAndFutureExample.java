package com.threads.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableAndFutureExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		// callableMethod();
		invokeAllExecutors();
	}

	public static void callableMethod() throws InterruptedException, ExecutionException, TimeoutException {
		Callable<Integer> task = () -> {
			try {
				TimeUnit.SECONDS.sleep(5);

				return 123;
			} catch (InterruptedException e) {
				// TODO: handle exception
				throw new IllegalArgumentException("task interrupted", e);
			}
		};
		// callable is also same as run() but callable can returns a return value
		// through the furture interface.
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Integer> future = executor.submit(task);
		System.out.println("future done ? " + future.isDone());
		Integer result = future.get();
		System.out.println("future done ? " + future.isDone());
		System.out.println("result: " + result);

		// Timeouts
		future = executor.submit(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
				return 1234;
			} catch (InterruptedException e) {
				throw new IllegalArgumentException("task is interrupted", e);
			}
		});
		future.get(1, TimeUnit.SECONDS);
	}

	public static void invokeAllExecutors() throws InterruptedException {
		ExecutorService executor = Executors.newWorkStealingPool();
		List<Callable<String>> callables = Arrays.asList(() -> "task1", () -> "task2", () -> "task3");

		executor.invokeAll(callables).stream().map(future -> {
			try {
				return future.get();
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}).forEach(System.out::println);
	}

}
