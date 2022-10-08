package com.exceptions.working;

import java.util.Scanner;

public class CustomizeException {
	public static void main(String[] args) {
		/*
		 * try { throw new MyException("newly created user defined exception");
		 * }catch(MyException e) { System.out.println("caught");
		 * System.out.println(e.getMessage()); }
		 */
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		age = sc.nextInt();
		
		if(age<18) {
			throw new TooYoungException("you are too Young for getting marriage");
		}else if(age>60){
			throw new TooOldException("you are too late for getting marriage");
		}else {
			System.out.println("we will connect to you soon");
		}
	}
}
class TooYoungException extends RuntimeException{

	public TooYoungException(String message) {
		super(message);
	}
	
}
class TooOldException extends RuntimeException{

	public TooOldException(String message) {
		super(message);
	}
	
}
/*
 * class MyException extends RuntimeException{
 * 
 * public MyException(String message) { super(message); // TODO Auto-generated
 * constructor stub }
 * 
 * }
 */