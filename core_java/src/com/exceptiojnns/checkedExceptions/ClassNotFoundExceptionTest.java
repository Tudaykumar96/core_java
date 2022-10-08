package com.exceptiojnns.checkedExceptions;

public class ClassNotFoundExceptionTest {
	public static void main(String[] args) {
		try {
			Class name = Class.forName("com.exceptions.working.CustomizeException");
			System.out.println(name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
