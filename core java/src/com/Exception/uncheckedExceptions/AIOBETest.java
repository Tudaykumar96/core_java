package com.Exception.uncheckedExceptions;

import java.util.Arrays;
import java.util.Scanner;

public class AIOBETest {
	public static void main(String[] args) {
		int[] arr = {23,24,25,26,27,28,29};
		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter required index :");
		try {
		int element = sc.nextInt();
		
		System.out.println(element);
		System.out.println("The entered element is :: " + arr[element]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("your index is out of bound ");
			System.out.println("so please verify the required index and call it");
		}
	}
}
