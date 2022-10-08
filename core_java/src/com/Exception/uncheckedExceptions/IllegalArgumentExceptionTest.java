package com.Exception.uncheckedExceptions;

import java.util.Scanner;

public class IllegalArgumentExceptionTest {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(getLength(name));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		name = "";
		System.out.println(getLength(name));
		name = "georgeberger";
		System.out.println(getLength(name));

	}

	public static int getLength(String name) {
		if (name == null) {
			throw new IllegalArgumentException("the argument cannot be null");
		}
		return name.length();
	}
}

// to handle illegal Argument Exception use try catch
class Student {
	public static void main(String[] args) {
		String content = "y";
		run(content);
	}

	public static void run(String content) {

		while (content.equalsIgnoreCase("y")) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a value:");
				int marks = sc.nextInt();

				if (marks < 0 || marks > 100) {
					System.out.println(marks);
					throw new IllegalArgumentException("marks should be in between 1 to 100 ");

				}

			} catch (IllegalArgumentException e) {
				System.out.println("out of range encounterd");
				e.printStackTrace();
				/*
				 * content = sc.next(); if(content.equalsIgnoreCase("Y")) run(content);
				 */
			}
		}

	}
}