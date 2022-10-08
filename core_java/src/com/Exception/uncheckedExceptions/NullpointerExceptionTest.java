package com.Exception.uncheckedExceptions;

public class NullpointerExceptionTest {
	public static void main(String[] args) {
//		Object obj= null;
//		obj.toString();
		String message = null;
		try {
			//string comparsions with literals
			
//			if(message.equals("hello"))
//				System.out.println("same");
			
			//using string literals rather than objects
			if ("hello".equals(message))
				System.out.println("both are same");
			else
				System.out.println("both are not same");

		} catch (NullPointerException e) {
			System.out.println("NullpointerException caught");
			e.printStackTrace();
		}
	}

}
// to avoid null pointer exception using ternary operator
class NPETernaryOperator{
	public static void main(String[] args) {
		String str = null;
		String message = (str==null)?"hi hello ":str.substring(0, 5);
		System.out.println("using ternary operator handling NPE");
		System.out.println(message);
		
		str = "null value can be assigned to string value";
		message = (str==null)?"":str.substring(0, 20);
		System.out.println("another condition for the ternary operator");
		System.out.println(message);
	}
}