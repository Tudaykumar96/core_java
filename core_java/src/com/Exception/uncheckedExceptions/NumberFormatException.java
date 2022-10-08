package com.Exception.uncheckedExceptions;

import java.util.Scanner;

public class NumberFormatException {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter a String: ");
			try {
				number = Integer.parseInt(sc.next());

				System.out.println("entered number : " + number);
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				System.out.println("exception caught");
			}
		}
	}
}
