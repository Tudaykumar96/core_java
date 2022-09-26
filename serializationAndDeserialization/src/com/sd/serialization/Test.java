package com.sd.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {
	public static void main(String[] args) throws IOException {
		Dog dog1 = new Dog(2,"black");
		System.out.println("serialization started");
		try {
			FileOutputStream fis = new FileOutputStream("aaaaa.txt");
			ObjectOutputStream out =  new ObjectOutputStream(fis);
			out.writeObject(dog1);
			System.out.println("serialization ended");
		} catch (FileNotFoundException e) {
			System.out.println("file not found Exception..");
		}
			
	}
}
class Dog implements Serializable{
	int age;
	String colour;
	public Dog(int age, String colour) {
		this.age = age;
		this.colour = colour;
	}
	
}