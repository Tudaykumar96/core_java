package com.threads.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.lock();
		System.out.println(lock.isLocked());//locked - true
		System.out.println(lock.isHeldByCurrentThread());// yes - true
		System.out.println(lock.getQueueLength());//0
		System.out.println(lock.getHoldCount());//2
		lock.unlock();
		System.out.println(lock.getHoldCount());//1
		System.out.println(lock.isLocked());//yes - true
		lock.unlock();
		System.out.println(lock.isLocked());//false
		System.out.println(lock.isFair());//false
	}
}
