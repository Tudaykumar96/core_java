package com.exceptions.working;

public class ThrowsExceptionTest {
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * doStuff(); } public static void doStuff() throws InterruptedException {
	 * doMoreStuff();
	 * 
	 * } public static void doMoreStuff() throws InterruptedException {
	 * Thread.sleep(1000); System.out.println("hello"); }
	 */
	public static void main(String[] args) {
	try {
		System.out.println("hello");
	}catch(Error e) {
		throw e;
	}//in checked exceptions we cant write the try catch explictily rather we can throws it.
		
	}
}
