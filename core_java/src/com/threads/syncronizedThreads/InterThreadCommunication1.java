package com.threads.syncronizedThreads;

public class InterThreadCommunication1 {
	public static void main(String[] args) {
		Chat c = new Chat();
		new T1(c);
		new T2(c);
	}
}
class Chat{
	boolean flag=false;
	public synchronized void question(String msg) throws InterruptedException {
		if(flag) {
			wait();
		}else {
			System.out.println(msg);
			notify();
		}
			
	}
	public synchronized void answer(String msg) throws InterruptedException {
		if(!flag) {
			wait();
		}
		else {
			System.out.println(msg);
			notify();
		}
		
	}
}
class T1 implements Runnable{

	Chat m;
	String[] s1={"Hi", "How","are", "you"};
	
	
	public T1(Chat m) {
		this.m = m;
		new Thread(this,"question").start();
	}


	@Override
	public void run() {
		for(int i=0;i<s1.length;i++) {
		try {
			m.question(s1[i]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}
class T2 implements Runnable{
	Chat m;
	String[] s2={"iam fine", "what","about", "you"};
	
	
	public T2(Chat m) {
		this.m = m;
		new Thread(this,"answer").start();
	}


	@Override
	public void run() {
		for(int i=0;i<s2.length;i++) {
		try {
			m.answer(s2[i]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}
