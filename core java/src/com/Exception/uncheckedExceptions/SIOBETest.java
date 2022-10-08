package com.Exception.uncheckedExceptions;

public class SIOBETest {
	public static void main(String[] args) {
		String str = "you are now dealing with StringIndexOutOfException";
		System.out.println(str.length());
		try {
		System.out.println(str.substring(51));
		str.charAt(55);
		System.out.println("compiles fine");
		
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("exception raised");
			e.printStackTrace();
		}
	}
}
