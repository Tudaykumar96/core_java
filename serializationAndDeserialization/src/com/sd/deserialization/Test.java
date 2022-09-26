package com.sd.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		readDogInfo();
	}
	public static void readDogInfo() throws IOException, ClassNotFoundException {
		Dog dog = new Dog("6","red");
		System.out.println("deserialization started");
		try {
			FileInputStream fis = new FileInputStream("aaaaa.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ois.readObject();
			ois.close();
			fis.close();
			System.out.println("deserialization ended..");
			System.out.println("age : "+ dog.age);
			System.out.println("colour : "+ dog.colour);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException caught");
		}
	}
}
class Dog{
	String age;
	String colour;
	public Dog(String age, String colour) {
		this.age = age;
		this.colour = colour;
	}
	
	
}
