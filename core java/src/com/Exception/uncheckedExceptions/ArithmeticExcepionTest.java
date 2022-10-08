package com.Exception.uncheckedExceptions;

public class ArithmeticExcepionTest {
	public static void main(String[] args) {
		display();
	}

	public static void display() {
		int a = 0;
		int b = 10;
		int c;

		try {
			c = b / a;
			System.out.println(c);// Arithmethic exception is raised so to handle it use try with catch
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("printing sucessfully");
		}
	}

}
