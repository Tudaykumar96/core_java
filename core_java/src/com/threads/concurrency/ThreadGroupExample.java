package com.threads.concurrency;

public class ThreadGroupExample {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());// mainThread
		System.out.println(Thread.currentThread().getId());// 1
		System.out.println(Thread.currentThread().getThreadGroup().getName());// mainThreadGroup
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());// systemThread
		ThreadGroup g = new ThreadGroup("firstGroup");
		System.out.println(g.getParent().getName());// firstgroup parent is mainthread group
		ThreadGroup g1 = new ThreadGroup(g, "secondGroup");
		System.out.println(g1.getParent().getName());// secondgroup parent is firstGroup
		Thread[] t = new Thread[10];
		g1.enumerate(t);
		for(Thread t1:t) {
			System.out.println(t1.getName());
		}
	}
}
