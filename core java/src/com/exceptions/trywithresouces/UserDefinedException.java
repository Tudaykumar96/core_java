package com.exceptions.trywithresouces;

public class UserDefinedException extends RuntimeException {

	public UserDefinedException(String message) {
		super(message);
	}

	public static void fun() throws UserDefinedException {
		System.out.println("always throws an user friendly exception...");
		throw new UserDefinedException("Raised user defined Exception..");
	}

}

class Test {
	public static void main(String[] args) throws UserDefinedException {
		try {
			UserDefinedException.fun();
		} catch (UserDefinedException e) {
			System.out.println("exception caught .. and perform the remaining operations");
			System.out.println(e.getClass().getName());
		}
		UserDefinedException.fun();
	}
}

