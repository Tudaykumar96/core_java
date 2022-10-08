package com.exceptions.working;

// throw keyword is used for throw a customized exception to the jvm. then jvm will calls the main(); 
public class ThrowStatementExample extends RuntimeException{
	
	public static void main(String[] args) {
		throw new ThrowStatementExample();
		//throw new ArithmeticException("/by zero");
		//System.out.println(10/0);
	}

}

