package com.threads.syncronizedThreads;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProducerConsumerExample {
	public static void main(String[] args) throws InterruptedException {
		Producer p = new Producer();
		Consumer c = new Consumer();
	}
}
class Producer{

	public Producer() {
		Queue q = new PriorityQueue();
		synchronized (q) {
			System.out.println("producer class");
			q.notify();
			
		}
	}
	
	
}
class Consumer{

	public Consumer() throws InterruptedException {
		Queue q = new PriorityQueue();
		synchronized (q) {
			System.out.println("consumer class");
			if(q.isEmpty()) {
				q.wait();
			}else {
				System.out.println("prints the required thread");
			}
			
		}
		
	}
	
	
}
