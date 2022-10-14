package com.exceptiojnns.checkedExceptions;

import com.exceptions.working.UdayClassNotFoundException;

public class ClassNotFoundExceptionTest {
	public static void main(String[] args) {

		ClassNotFoundExceptionTest classNotFoundExceptionTest = new ClassNotFoundExceptionTest();
		classNotFoundExceptionTest.classNotFound();
	}

	public void classNotFound()  {
		try {
			
			//Class name = Class.forName("com.exceptions.working.CustomizeExcepton");
			//System.out.println(name);
			throw new UdayClassNotFoundException("donejeeeeeeee");
		}
		
		
		  catch (UdayClassNotFoundException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		 
		 
		
		finally {
			System.out.println("done");
		}
	}

}
