package com.threads.concurrency;

public class ThreadLocalInheritance {
	public static void main(String[] args) {
		ParentThread p = new ParentThread();
		p.start();
		
	}
	
}
class ParentThread extends Thread{
	 static InheritableThreadLocal l = new InheritableThreadLocal() {

		@Override
		protected Object childValue(Object p) {
			
			return "cc";
		}
		 
	 };

	@Override
	public void run() {
		l.set("pp");
		System.out.println("parentThreadValue : "+l.get());
		ChildThread c = new ChildThread();
		c.start();
	}
	
}
class ChildThread extends Thread{
	public void run() {
		System.out.println("childThreadValue : "+ParentThread.l.get());
	}
}