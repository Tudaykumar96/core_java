package com.corejava.basicexamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromConsole {
	public static void main(String[] args) throws IOException {
		/*// enter data using bufferedReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// reading data using readline()
		String name = reader.readLine();
		// print the read line
		System.out.println(name);
	
		// using scanner class for getting input from the user
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("enter age :" + age);
		String name1 = sc.next();
		System.out.println("enter string:" + name1);
		float height = sc.nextFloat();
		System.out.println("enter float:" + height);
		String gender = sc.next();
		System.out.println("enter another String:" + gender);
		*/
		//using console class
		String name2 = System.console().readLine();
		System.out.println("enter name is :" +name2);
	}
}
