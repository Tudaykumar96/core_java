package com.threads.syncronizedThreads;

public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		SyncornizedThreadA t = new SyncornizedThreadA();
		t.start();
		synchronized(t) {
		System.out.println("mainThread");
		t.wait();
		System.out.println("mainThread got notifited call");
		System.out.println(t.total);
		}
	}

}
class SyncornizedThreadA extends Thread{

	int total = 0;
	@Override
	public void run() {
		synchronized(this) {
			System.out.println("childThread starts Execution");
			for(int i=0;i<5 ;i++) {
				total = total+i;
			}
			System.out.println("childThread giving notification call");
			this.notify();
			System.out.println("get notified");
			
		}
	}
	
}