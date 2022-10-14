package com.threads.syncronizedThreads;

public class DaemonThreadExample {
	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		//t.setDaemon(true);// it will executes main thread only
		// when non Daemon thread gets terminated automatically Daemon thread also terminated
		
		//t.isDaemon();
		
		t.start();
		t.isInterrupted();
		System.out.println("mainThread");
	}
}
class MyThread6 extends Thread{

	public void run() {
		for(int i =0;i<=5;i++) {
			System.out.println("lazy childThread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}