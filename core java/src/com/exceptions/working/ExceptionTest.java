package com.exceptions.working;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("line 1");
		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
			e.printStackTrace();// by default exception handler internally uses//it will prints whole
								// information about exception in what line
			System.out.println(e);// it will prints exception information
			System.out.println(e.getMessage());// it will print cause of exception

			System.out.println(10 / 2);
			//order should be followed form child to parent
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("line 3");
	}
}
