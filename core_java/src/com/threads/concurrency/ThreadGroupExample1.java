package com.threads.concurrency;

public class ThreadGroupExample1 {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup parentGroup = new ThreadGroup("parentGroup");
		ThreadGroup childGroup = new ThreadGroup("childGroup");
		
		MyThread thread1 = new MyThread(parentGroup, "child");
		MyThread thread2 = new MyThread(parentGroup, "child");
		thread1.start();
		thread2.start();
		
		System.out.println(parentGroup.activeCount());//2 threads
		System.out.println(parentGroup.activeGroupCount());//0 groups
		parentGroup.list();
		System.out.println("wait it is in sleeping mode");
		Thread.sleep(1000);
		System.out.println(parentGroup.activeCount());
		System.out.println(parentGroup.activeGroupCount());
		parentGroup.list();
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread t1 :t) {
			System.out.println(t1.getName()+"---"+t1.isDaemon());
		}
		
	}
}
class MyThread extends Thread{

	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}
	public void run(){
		System.out.println("childThread");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}