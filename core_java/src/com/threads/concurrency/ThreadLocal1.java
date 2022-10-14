package com.threads.concurrency;

public class ThreadLocal1 {
	public static void main(String[] args) {
		ThreadLocal l = new ThreadLocal() {

			@Override
			protected Object initialValue() {
				
				return "abc";
			}
			
		};
		System.out.println(l.get());
		l.set("durga");
		System.out.println(l.get());
		l.remove();
		System.out.println(l.get());
	}
}
