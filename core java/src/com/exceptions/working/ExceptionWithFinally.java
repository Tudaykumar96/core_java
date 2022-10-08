package com.exceptions.working;

public class ExceptionWithFinally {
	public static void main(String[] args) {
		try{// is used to handle the exception
			System.out.println("try block");//if execption is not raised then catch block will not executed
			System.out.println(10/0);//then catch block will executes
		}catch(NullPointerException e){
			//(ArithmeticException e)//if exception type is not matched then it will not executed
			System.out.println("catch block");
		}finally {// it will executes all ways for cleaning up the code
			System.out.println("finally block");
		}
	}
}
class FinallywithoutTry{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(10/0);
		}finally {
			String s = null;
			System.out.println(s.length());
		}
	}
}
